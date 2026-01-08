// LeetCode 1365. How Many Numbers Are Smaller Than the Current Number
// Time: O(n)
// Space: O(1) (fixed array of size 101)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
        }

        return result;
    }
}
