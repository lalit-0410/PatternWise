package LeetCodeDaily;

public class LT3754 {
    static long sumAndMultiply(int n){
        long ans =0;
        long sum=0;
        while(n>0){
            ans=ans*10+(n%10);
            if ((n%10)!=0){
            sum=sum+(n%10);
        }
            n=n/10;
        }
        long rev=0;
        while(ans>0){
            rev=rev*10+(ans%10);
            ans=ans/10;
        }
        return rev*sum;


    }
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(120254));
    }
}
