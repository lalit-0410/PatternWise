package TwoPointer;

import java.util.Arrays;

public class LT_16 {
    static int closestSum(int[] nums, int target){

        Arrays.sort(nums);
        int n=nums.length;
        int resultSum=-1;

        int minDiff=Integer.MAX_VALUE;

        for (int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;


            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(sum-target);
                if(minDiff>diff){
                    minDiff=diff;
                    resultSum=nums[i]+nums[left]+nums[right];
                }

                if (sum == target) {
                    return sum;
                }
            else if (sum<target) {
                left++;
            }
            else {
                right--;
            }
        }
    }

        return resultSum;
    }
    public static void main(String[] args) {
    int[] arr={-1,2,1,-4};
    int target=1;
        System.out.println(closestSum(arr,target));
    }
}
