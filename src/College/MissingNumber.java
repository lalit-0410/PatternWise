package College;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums={0,1,3};
        int n=nums.length;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=nums[i];
        }
        int total=n*(n+1)/2;
        System.out.println(total-sum);
    }
}
