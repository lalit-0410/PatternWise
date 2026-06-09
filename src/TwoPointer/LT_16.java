package TwoPointer;

import java.util.Arrays;

public class LT_16 {
    static int closestSum(int[] nums, int target){

        Arrays.sort(nums);
        int n=nums.length;
        int closest=nums[0]+nums[1]+nums[2];

        for (int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;

            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(Math.abs(target-sum)<Math.abs(target-closest)){
                closest=sum;

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

        return closest;
    }
    public static void main(String[] args) {
    int[] arr={-1,2,1,-4};
    int target=1;
        System.out.println(closestSum(arr,target));
    }
}
