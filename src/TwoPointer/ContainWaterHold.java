package TwoPointer;

public class ContainWaterHold {
    static void MaxWater(int[] nums){
        int maxWater=Integer.MIN_VALUE;
        //brute force
        /*for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int width=j-i;
                int maxHeight=Math.min(nums[i],nums[j]);
                int waterHold=width*maxHeight;
                if(maxWater<waterHold){
                    maxWater=waterHold;
                }
            }
        }*/
        int left=0,right=nums.length-1;
        while (left<right){
            int width=right-left;
            int minHeight=Math.min(nums[left],nums[right]);
            int waterHold=width*minHeight;
            maxWater=Math.max(maxWater,waterHold);
            if(nums[left]<nums[right]){
                left++;
            }
            else {
                right--;
            }

        }

        System.out.println(maxWater);
    }
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        MaxWater(arr);
    }
}
