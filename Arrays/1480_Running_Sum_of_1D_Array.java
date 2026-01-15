// LeetCode 1480: Running Sum of 1D Array
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
