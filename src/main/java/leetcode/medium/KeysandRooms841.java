package leetcode.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author dozken
 * On 17-Jun-19.
 */
public class KeysandRooms841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        dfs(0, rooms, visited);
        return visited.size() == rooms.size();
    }

    private void dfs(int roomId, List<List<Integer>> rooms, Set<Integer> visited) {
        if (visited.contains(roomId)) {
            return;
        }
        visited.add(roomId);
        for (Integer room : rooms.get(roomId)) {
            dfs(room, rooms, visited);
        }
    }
}
