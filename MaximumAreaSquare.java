import java.util.*;
public class MaximumAreaSquare {
    
}

 class Solution {

	public static int maximumAreaSquare(ArrayList<ArrayList<Integer>> mat, int n, int m) {
		// Write your code here
        int dp[][]=new int[n+1][m+1];
        int max=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(mat.get(i-1).get(j-1)==1)
                {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    max=Math.max(max,dp[i][j]);  
                }
            }
        }
        return max*max;
	}
}
