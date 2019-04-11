package leetcode.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfIslands200 {

    public int numIslandsBFS(char[][] grid) {
        if (grid.length == 0)
            return 0;

        int nr = grid.length;
        int nc = grid[0].length;
        char water = '0';
        char island = '1';


        int numIslands = 0;

        Queue<int[]> q = new ArrayDeque<>();

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == island) {
                    numIslands++;
                    q.offer(new int[]{r, c});
                    grid[r][c] = water;

                    while (!q.isEmpty()) {
                        int[] poll = q.poll();
                        int row = poll[0];
                        int col = poll[1];

                        if (row - 1 >= 0 && grid[row - 1][col] == island) {
                            q.offer(new int[]{row - 1, col});
                            grid[row - 1][col] = water;
                        }
                        if (row + 1 < nr && grid[row + 1][col] == island) {
                            q.offer(new int[]{row + 1, col});
                            grid[row + 1][col] = water;
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == island) {
                            q.offer(new int[]{row, col - 1});
                            grid[row][col - 1] = water;
                        }
                        if (col + 1 < nc && grid[row][col + 1] == island) {
                            q.offer(new int[]{row, col + 1});
                            grid[row][col + 1] = water;
                        }
                    }
                }
            }
        }

        return numIslands;
    }

    public int numIslandsDFS(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count += dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private int dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0
                || i >= grid.length || j >= grid[0].length
                || grid[i][j] == '0')
            return 0;
        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

        return 1;
    }
}
