// Leetcode 66. Plus One
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;      // no carry needed
                return digits;
            }
            digits[i] = 0;        // carry continues
        }

        // All digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
