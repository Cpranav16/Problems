// Leetcode 1854. Maximum Population Year
// Time Complexity: O(n + Y), n = number of people (logs.length), Y = number of years in range (1950–2050 → 101 years, constant), Since Y is fixed, this effectively becomes O(n)
// Space Complexity: O(Y) → O(1) (constant space, array of size 101)

class Solution {
    public int maximumPopulation(int[][] logs) {
        // Years range from 1950 to 2050 per problem constraints
        int[] population = new int[101]; // 1950 → index 0, 2050 → index 100
        
        // Apply difference array logic
        for (int[] log : logs) {
            population[log[0] - 1950]++;   // birth year
            population[log[1] - 1950]--;   // death year
        }
        
        int maxPop = 0;
        int currentPop = 0;
        int year = 1950;
        
        // Prefix sum to find max population year
        for (int i = 0; i < population.length; i++) {
            currentPop += population[i];
            if (currentPop > maxPop) {
                maxPop = currentPop;
                year = 1950 + i;
            }
        }
        
        return year;
    }
}
