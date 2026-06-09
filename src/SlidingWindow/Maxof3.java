package SlidingWindow;

public class Maxof3 {
    static void max(int[] nums,int size){
        int n=nums.length;
        int low=0;
        int high=size-1;
        int sum=0;
        for(int j=low;j<=high;j++) {
            sum += nums[j];
        }
        int max=sum;
        while (high<n-1){

            low++;
            high++;

            sum=(sum-nums[low-1])+nums[high];
            if(sum>max){
                max=sum;
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] nums={100,200,300,400};
        int size=1;
        max(nums,size);
    }
}
