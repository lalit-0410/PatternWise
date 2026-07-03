package DP_1;

public class MinCostClimbStairs
{
    private static int minCost(int[] cost) {
        int n=cost.length;
        return Math.min(solve(n-1,cost),
                                solve(n-2,cost));
    }
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
    }
    public static void main(String[] args)
    {
        int [] cost={10,15,20};
        System.out.println(minCost(cost));
    }


}
