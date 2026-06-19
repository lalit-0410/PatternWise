package SlidingWindow;

public class MinimumSizeSubArraySum {
    static void minimumSize(int[] nums,int target){
        int left=0;
        int ans=Integer.MAX_VALUE;
        int totalSum=0;
        for(int right=0;right<nums.length;right++){
            totalSum=totalSum+nums[right];
            while (totalSum>=target){
                int len=right-left+1;
                ans=Math.min(ans,len);
                totalSum=totalSum-nums[left];
                left++;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        minimumSize(nums,target);


    }
}
