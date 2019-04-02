package leetcode.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class WallsandGates286 {

    public void wallsAndGates(int[][] rooms) {
        bfs(rooms);
        dfs(rooms);
    }

    private void dfs(int[][] rooms) {
        if (rooms.length <= 0)
            return;

        int nr = rooms.length;
        int nc = rooms[0].length;
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (rooms[i][j] == 0) {
                    dfsHepler(rooms, i, j, 0);
                }
            }
        }
    }

    private void dfsHepler(int[][] rooms, int i, int j, int d) {
        if (i < 0 || i >= rooms.length ||
                j < 0 || j >= rooms[0].length ||
                rooms[i][j] <= d && d != 0) {
            return;
        }

        rooms[i][j] = d;

        dfsHepler(rooms, i, j + 1, d + 1);
        dfsHepler(rooms, i, j - 1, d + 1);
        dfsHepler(rooms, i + 1, j, d + 1);
        dfsHepler(rooms, i - 1, j, d + 1);
    }

    private void bfs(int[][] rooms) {
        if (rooms.length <= 0)
            return;

        int nr = rooms.length;
        int nc = rooms[0].length;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (rooms[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int row = poll[0];
            int col = poll[1];

            int distance = rooms[row][col] + 1;
            if (row - 1 >= 0 && rooms[row - 1][col] == Integer.MAX_VALUE) {
                rooms[row - 1][col] = distance;
                queue.offer(new int[]{row - 1, col});
            }
            if (row + 1 < nr && rooms[row + 1][col] == Integer.MAX_VALUE) {
                rooms[row + 1][col] = distance;
                queue.offer(new int[]{row + 1, col});
            }
            if (col - 1 >= 0 && rooms[row][col - 1] == Integer.MAX_VALUE) {
                rooms[row][col - 1] = distance;
                queue.offer(new int[]{row, col - 1});
            }
            if (col + 1 < nc && rooms[row][col + 1] == Integer.MAX_VALUE) {
                rooms[row][col + 1] = distance;
                queue.offer(new int[]{row, col + 1});
            }
        }
    }
}
