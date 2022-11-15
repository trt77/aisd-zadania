import java.util.*;
//Source: youtube

// (1) BFS
class Solution {
    public static Object canMeasureWater(int x, int y, int z) {
        if (x + y < z) return false;

        int[] directions = {x, -x, y, -y};
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        Iterator<Integer> value = visited.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == z) return true;
            for (int direction : directions){
                int total = direction + cur;
                if (total == z) return true;
                if (total < 0 || total > x + y) continue;
                if (!visited.contains(total)) {
                    visited.add(total);
                    q.offer(total);
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
        System.out.println(canMeasureWater(15,2, 30));
    }
}