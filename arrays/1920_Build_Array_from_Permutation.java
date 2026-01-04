// LeetCode 1920: Build Array from Permutation
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
}
