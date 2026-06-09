package TwoPointer;

import java.util.HashMap;

public class LT_1 {
    static int[] twoUnsorted(int[] arr, int target){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(hashMap.containsKey(diff)){
                return new int[]{hashMap.get(diff),i};
            }
            else {
                hashMap.put(arr[i],i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] arr={2,5,11,9,8,15};
        int target=10;
        int[] a=twoUnsorted(arr,target);
        for(int i:a){
            System.out.print(i+" ");
        }

    }
    }

