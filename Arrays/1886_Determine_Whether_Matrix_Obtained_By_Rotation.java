// Leetcode 1886. Determine Whether Matrix Can Be Obtained By Rotation
// Time Complexity: Each rotation: O(n²), Each comparison: O(n²), Max 4 rotations, Total Time: O(4 × n²) = O(n²)
// Space Complexity: Extra matrix used for rotation, Space: O(n²)

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int r = 0; r < 4; r++) {
            if (equals(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    private int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }

    private boolean equals(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
