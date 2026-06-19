package SlidingWindow;

public class LongestWindowLessThan80 {
    static void longest(int[] arr,int k){
        int left=0;
        int totalSum=0;
        int maxLen=0;
        for (int right  = 0; right < arr.length; right++) {
            totalSum=totalSum+arr[right];
            while (totalSum>k){
                totalSum=totalSum-arr[left];
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int[] arr={30,40,50,10,70,50};
        longest(arr,80);
    }
}
