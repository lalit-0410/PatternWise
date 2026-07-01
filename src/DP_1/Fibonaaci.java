package DP_1;

import java.util.Arrays;

public class Fibonaaci {
    /* RECURSION
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }*/

    /* MEMORIZATION TOP DOWN
    static int fib(int n, int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }*/

    /*TABULATION BOTTOM UP
    static int fib(int n){
        if(n<=1){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }*/

    //MEMORY OPTIMIZATION
    static int fib(int n){
        if(n<=1){
            return n;
        }
        int prev1=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }


    public static void main(String[] args) {
    int n=6;
//    int[] dp=new int[n+1];
      //  Arrays.fill(dp,-1);
        System.out.println(fib(n));
    }
}
