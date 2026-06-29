package College;

public class BestTimeToBuySell {
    static void maxProfit(int[] nums){
        int buy=nums[0];
        int max=0;

        for (int i = 1; i < nums.length; i++) {
            if(buy>nums[i]){
                buy=nums[i];
            }
            else if(nums[i]-buy>max){
                max=nums[i]-buy;
            }


        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] n={7,1,5,3,6,4};
        maxProfit(n);
    }
}
