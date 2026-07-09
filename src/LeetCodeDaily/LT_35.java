package LeetCodeDaily;

public class LT_35 {
    static int searchInsert(int[] nums,int target){
    /*{
        for (int i = 0; i < nums.length; i++) {
            if(target<=nums[i]){
                return i;
            }
            }

        return nums.length;
    }
    */
    int low=0;
    int high=nums.length-1;
    while (low<=high)
    {
        int mid=(low+high)/2;
        if(target==nums[mid])
        {
            return mid;
        } else if (target<nums[mid]) {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
    }
    return low;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6,10};
        int target =7;
        System.out.println(searchInsert(nums,target));
    }
}
