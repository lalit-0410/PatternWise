package TwoPointer;

import java.util.Arrays;

public class TripletWithSmallerSum {
    static int smallerSum(int[] nums,int target){
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        for (int i=0;i<n-2;i++){

            int left=i+1;
            int right=n-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<target){

                    ans=ans+(right-left);
                    left++;
                }
                else {

                    right--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-2,0,1,3};
        int target=2;
        System.out.println(smallerSum(arr,target));
    }
}
