package TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumDuplicate {
    static void uniquePair(int[] nums,int target){
        int left=0, right=nums.length-1;
        List<int[]> pairs = new ArrayList<>();

        while (left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                pairs.add(new int[]{nums[left],nums[right]});
                left++;
                right--;

                //skip duplicate
                while (nums[left]==nums[left-1]){
                    left++;
                }
                while (nums[right]==nums[right+1]){
                    right--;
                }

            }
            else if (sum>target){
                right--;
            }
            else {
                left--;
            }

        }
        for (int[] p : pairs) {
            System.out.println(p[0] + " " + p[1]);
        }

    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};
        int target=4;
        uniquePair(arr,target);
    }
}
