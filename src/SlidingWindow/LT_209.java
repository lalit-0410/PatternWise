package SlidingWindow;

public class LT_209 {
    static int minSubArrayLen(int[] nums, int target){
        int low=0;
        int high=0;
        int n=nums.length;
        int minLen=Integer.MAX_VALUE;
        int sum=0;
        while (high<n){
            sum=sum+nums[high];
            while (sum>=target){
                int min=high-low+1;
                if(min<minLen){
                    minLen=min;
                }
                sum=sum-nums[low];
                low++;
            }
            high++;
        }
        return minLen;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(nums,target));
    }
}
