// Leetcode 1380. Lucky Numbers in a Matrix
// Time Complexity: O(m × n)
// Space Complexity: O(m + n)

import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMin = new int[m];
        int[] colMax = new int[n];

        // Initialize rowMin with large values
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        // Initialize colMax with small values
        Arrays.fill(colMax, Integer.MIN_VALUE);

        // Find row minimums and column maximums
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Find lucky numbers
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}
