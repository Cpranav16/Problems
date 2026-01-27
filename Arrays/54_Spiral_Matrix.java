// Leetcode 54. Spiral Matrix
// Time Complexity: O(m × n)
// Space Complexity: O(1) extra space (excluding output list), O(m × n) for the List<Integer> result

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return list;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
