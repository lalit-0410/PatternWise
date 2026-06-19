package SlidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    static int fruit(int[] fruits,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int maxLen=-1;

        for(int right=0;right<fruits.length;right++){
            int current=fruits[right];
            map.put(current,map.getOrDefault(current,0)+1);
            if(map.size()==k || map.size()<k){
                int len=right-left+1;
                maxLen=Math.max(len,maxLen);
            }
            while (map.size()>k){
                int leftcurr=fruits[left];
                map.put(leftcurr,map.get(leftcurr)-1);
                if(map.get(leftcurr)==0){
                    map.remove(leftcurr);
                }
                left++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int[] fruits = {1,1,1,2,2,4};
        System.out.println(fruit(fruits,2));
    }
}
