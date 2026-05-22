package TwoPointer;

public class LT_167 {
    static int[] two(int[] arr,int target){
        int st=0, end=arr.length-1;
        while (st<end){
            if(arr[st]+arr[end]==target){
                return new int[]{st,end};
            } else if (arr[st]+arr[end]>target) {
                end--;
            } else if (arr[st]+arr[end]<target) {
                st++;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int target=8;
        int[] a=two(arr,target);
        for(int i:a){
            System.out.print(i+" ");
        }

    }
}
