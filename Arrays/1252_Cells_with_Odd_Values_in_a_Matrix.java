// Leetcode 1252. Cells with Odd Values in a Matrix
// Time Complexity: O(m + n + k)   .....  k = number of indices
// Space Complexity: O(m + n)      .....  Arrays for row and column counts

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] idx : indices) {
            rows[idx[0]]++;
            cols[idx[1]]++;
        }
        int oddRows = 0, oddCols = 0;
        for (int r : rows) {
            if (r % 2 == 1) oddRows++;
        }
        for (int c : cols) {
            if (c % 2 == 1) oddCols++;
        }
        return oddRows * (n - oddCols) + (m - oddRows) * oddCols;
    }
}
