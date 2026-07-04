package DP_1;

import java.util.Arrays;

public class MinCostClimbStairs
{
    private static int minCost(int[] cost) {
        int n=cost.length;

        int prev2 = cost[0];
        int prev = cost[1];

        for(int i=2;i<cost.length;i++){

            int curr = cost[i]
                    + Math.min(prev,prev2);

            prev2 = prev;
            prev = curr;
        }

        return Math.min(prev,prev2);
    }


    /*Recursion
    private static int solve(int n,int[] cost){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        return cost[n]+
                Math.min(solve(n-1,cost)
                        ,solve(n-2,cost));
    }*/
    /*Memorization
    private static int solve(int i, int[] cost,int[] dp) {
        if(i==0){
            return cost[0];
        }
        if(i==1){
            return cost[1];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=cost[i]+Math.min(solve(i-1,cost,dp),solve(i-2,cost,dp));
        return dp[i];
    }*/


    public static void main(String[] args)
    {

        int [] cost={10,15,20};
        System.out.println(minCost(cost));
    }


}
