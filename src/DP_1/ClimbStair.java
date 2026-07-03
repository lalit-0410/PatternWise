package DP_1;

public class ClimbStair
{
    public static void main(String[] args)
    {
       int n=6;
        System.out.println(ways(n));
    }

    private static int ways(int n)
    {
        if(n<=2){
            return n;
        }
        int prev=1;
        int next=2;
        for (int i = 3; i <=n ; i++) {
            int temp=prev+next;
            prev=next;
            next=temp;

        }
        return next;
    }
}
