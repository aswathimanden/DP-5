// Time Complexity : O(m * n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i = 1; i < m; i++ ){
            for(int j = 1; j < n; j++){
                dp[j] = dp[j] + dp[j -1];
            }
        }
        return dp[n-1];
    }
}
