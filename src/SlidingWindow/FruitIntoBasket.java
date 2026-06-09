package SlidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    static int fruit(int[] fruits){
        int left=0;
        int maxLen=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int right=0;right<fruits.length;right++){
            int currFruit=fruits[right];
            map.put(currFruit,map.getOrDefault(currFruit,0)+1);
            while (map.size()>2){
                int leftFruit=fruits[left];
                map.put(leftFruit,map.get(leftFruit)-1);
                if(map.get(leftFruit)==0){
                    map.remove(leftFruit);
                }
                left++;
            }
                maxLen=Math.max(maxLen,right-left+1);


        }
        return maxLen;
    }

    public static void main(String[] args) {

        int[] fruits = {1,2,3,2,2};
        System.out.println(fruit(fruits));
    }
}
