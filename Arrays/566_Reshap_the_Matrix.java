// Leetcode 566. Reshape the Matrix
// Time Complexity: O(m × n)
// Space Complexity: O(r × c) for the new matrix (when reshape is valid), 
//                   O(1) extra space otherwise (original matrix returned)

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[index / c][index % c] = mat[i][j];
                index++;
            }
        }
        return result;
    }
}
