// 1217. Minimum Cost to Move Chips to The Same Position
// Time Complexity: O(n) 
// Space Complexity: O(1)

class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }
}

