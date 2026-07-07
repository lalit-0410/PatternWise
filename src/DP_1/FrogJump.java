package DP_1;

public class FrogJump {
    static int fun(int[] height){
        int k=height.length-1;
        return solve(k,height);
    }
    static int solve(int k,int[] height){
        if(k==0){
            return 0;
        }
        int x=solve(k-1,height)+Math.abs(height[k]-height[k-1]);
        int y=Integer.MAX_VALUE;
        if(k>1){
        y=solve(k-2,height)+Math.abs(height[k]-height[k-2]);

    }
        return Math.min(x,y);
    }
    public static void main(String[] args) {
        int[] height={10,15,10,15,10};

        System.out.println(fun(height));

    }
}
