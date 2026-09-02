package DP_2;

import java.util.Arrays;

public class UniquePaths_1 {
    /* MEMORIZATION
    public static int solve(int i,int j,int row,int column,int[][] dp)
    {
        if(i==row-1 && j==column-1)
        {
            return 1;
        }
        if(i>=row || j>=column)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int down=solve(i+1,j,row,column,dp);
        int right=solve(i,j+1,row,column,dp);
        dp[i][j]= down+right;
        return dp[i][j];
    }*/
    public static int solve(int m,int n,int[][] dp){

            dp[m-1][n-1] = 1; //Destination

                for (int i = m-1; i >= 0; i--) {
                    for (int j = n-1; j >= 0; j--) {
                        if (i == m-1 && j == n-1)
                        {
                            continue;
                        }
                        // done
                        int down = 0;
                        int right = 0;

                        if (i+1 <m) {
                            down= dp[i +1][j];
                        }
                        if (j+1 < n)
                            right = dp[i][j + 1];
                        dp[i][j] = down + right;

                    }

                }
                return dp[0][0];

            }


    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] dp=new int[m][n];

        /*for (int[] row:dp){
            Arrays.fill(row,-1);
        }*/

        int ans = solve( m, n,dp);

        System.out.println("Unique Paths = " + ans);
    }
}
