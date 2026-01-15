// LeetCode 1512. Number of Good Pairs
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            int freq = count.getOrDefault(num, 0);
            pairs += freq;       
            count.put(num, freq + 1);
        }

        return pairs;
    }
}
