package SlidingWindow;

public class MaxSubArraySum {
    public static int maxSubArr(int[] nums,int k){
        int low=0;
        int high=k-1;
        int sum=0;
        int n=nums.length;
        for (int i=low;i<=high;i++){
            sum=sum+nums[i];
        }
        int max=sum;
        while (high<n){

            low++;
            high++;
            if(high==n){
                break;
            }
            sum=sum-nums[low-1]+nums[high];
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={100,200,300,400};
        int k=2;
        System.out.println(maxSubArr(arr,k));
    }
}
