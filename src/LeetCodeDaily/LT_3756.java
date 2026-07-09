package LeetCodeDaily;

public class LT_3756 {
    public static long solve(String s,int left,int right){
        long number=0;
        int sum=0;
        for (int i=left;i<=right;i++)
        {
           char ch=s.charAt(i);
           if(ch != '0')
           {
               int digit=ch-'0';
               number=number*10+digit;
               sum=sum+digit;
           }
        }
        return number*sum;
    }
    public static void main(String[] args) {

        String s = "10203004";

        System.out.println(solve(s, 0, 7)); // 12340
    }

}
