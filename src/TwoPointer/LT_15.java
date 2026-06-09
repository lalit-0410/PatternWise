package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LT_15 {
    static void uniqueTriplet(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        List<int[]> triplet=new ArrayList<>();

        for (int i=0;i<n-2;i++){
            // Skip duplicate first element
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int left=i+1;
            int right=n-1;

                while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    triplet.add(new int[]{nums[i],nums[left],nums[right]});
                    left++;
                    right--;
                    //skip duplicate
                    while (left<n && nums[left]==nums[left-1]){
                        left++;
                    }

                    while (right>0 && nums[right]==nums[right+1]){
                        right--;
                    }
                } else if (sum<0) {
                    left++;
                }
                else {
                    right--;
                }
                }
            }
        for (int[] p : triplet) {
            System.out.println(p[0] + " " + p[1]+" "+p[2]);
        }

    }
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        uniqueTriplet(arr);
    }
}
