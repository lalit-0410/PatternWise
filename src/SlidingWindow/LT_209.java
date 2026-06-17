package SlidingWindow;

public class LT_209 {
    static int minSubArrayLen(int[] nums, int target){
        int low=0;
        int high=0;
        int n=nums.length;
        int sum=0;
        int result=Integer.MAX_VALUE;
        while (high<n){
            sum=sum+nums[high];
            while (sum>=target){
                int len=high-low+1;
                result=Math.min(result,len);
                sum=sum-nums[low];
                low++;
            }
            high++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(nums,target));
    }
}
