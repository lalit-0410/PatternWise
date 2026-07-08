package DP_2;

import java.util.Arrays;

public class UniquePath2Memo {


        static int solve(int i,int j,int[][] grid,int[][] dp){

            int m = grid.length;
            int n = grid[0].length;

            if(i>=m || j>=n)
                return 0;

            if(grid[i][j]==1)
                return 0;

            if(i==m-1 && j==n-1)
                return 1;

            if(dp[i][j]!=-1)
                return dp[i][j];

            int down = solve(i+1,j,grid,dp);
            int right = solve(i,j+1,grid,dp);

            return dp[i][j]=down+right;
        }

        public static void main(String[] args) {

            int[][] grid = {
                    {0,0,0},
                    {0,1,0},
                    {0,0,0}
            };

            int[][] dp=new int[3][3];

            for(int[] row:dp)
                Arrays.fill(row,-1);

            System.out.println(solve(0,0,grid,dp));
        }
    }

