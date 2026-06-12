package TwoPointer;

public class MoveZeroes {
    static void move(int[] nums){
        int left=0;
        for(int curr=0;curr< nums.length;curr++){
            if(nums[curr]!=0){
                int temp=nums[left];
                nums[left]=nums[curr];
                nums[curr]=temp;
                left++;
            }
        }
        for(int v:nums){
            System.out.print(v+" ");
        }
    }
    public static void main(String[] args) {
       int[] nums={1,0,5,6,0,4};
        move(nums);
    }
}
