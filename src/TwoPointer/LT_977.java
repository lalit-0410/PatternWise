package TwoPointer;

public class LT_977 {
    static void sortedSquare(int[] nums){
        int count=0,k=0;
        int n=nums.length;
        int[] res=new int[n];

        while (nums[count]<0){
            count++;

        }
        int i=count-1,j=count;
        while (i>=0 && j<n){
            if(nums[i]*nums[i]<nums[j]*nums[j]){
            res[k]=nums[i]*nums[i];
            i--;
        }
            else {
                res[k]=nums[j]*nums[j];
                j++;
            }
            k++;
        }
        while (i>=0){
            res[k++]=nums[i]*nums[i];
            i--;

        }
        while (j<n){
            res[k++]=nums[j]*nums[j];
            j++;
        }
        for(int a:res){
            System.out.print(a+" ");

        }
    }
    public static void main(String[] args) {
        int[] nums={-4,-1,0,2,4};
        sortedSquare(nums);
    }
}
