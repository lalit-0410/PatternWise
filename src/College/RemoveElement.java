package College;

import java.util.Scanner;

public class RemoveElement {
    static void removeEle(int[] nums,int element){
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=element){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(k);
        for (int i= 0; i <k ; i++) {

            System.out.print(nums[i]);
        }{
    }}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int removeElement=sc.nextInt();
        removeEle(arr,removeElement);
    }
}
