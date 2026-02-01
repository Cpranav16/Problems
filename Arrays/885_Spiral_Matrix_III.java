// Leetcode 885. Spiral Matrix III
// Time Complexity: O(m x n)
// Space Complexity: O(m x n)

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int count = 0;

        // Directions: East, South, West, North
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        int r = rStart, c = cStart;
        result[count++] = new int[]{r, c};

        int step = 1;   // number of steps in current direction
        int d = 0;      // direction index

        while (count < rows * cols) {
            for (int i = 0; i < 2; i++) { // repeat twice before increasing step
                for (int j = 0; j < step; j++) {
                    r += dirs[d][0];
                    c += dirs[d][1];

                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[count++] = new int[]{r, c};
                        if (count == rows * cols) return result;
                    }
                }
                d = (d + 1) % 4;
            }
            step++;
        }

        return result;
    }
}
