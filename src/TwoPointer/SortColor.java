package TwoPointer;

import java.util.Arrays;

public class SortColor {
    static int[] sort(int[] nums){
        int n=nums.length;
        int low=0;
        int curr=0;
        int high=n-1;
        while (curr<=high){
            if(nums[curr]==0){
                swap(nums,low,curr);
                low++;
                curr++;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else {
                swap(nums,curr,high);
                high--;
            }
        }
        return nums;
    }
    static void swap(int[]arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {

        int[] arr =
                {2,0,2,1,1,0};

        sort(arr);

        System.out.println(
                Arrays.toString(arr)
        );
    }
}