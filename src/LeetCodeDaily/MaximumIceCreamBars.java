package LeetCodeDaily;

import java.util.Arrays;

public class MaximumIceCreamBars {
    static void maximumBars(int[] costs,int coins){
        Arrays.sort(costs);
    int spendCoin=0;
    int countBar=0;
        for (int cost : costs) {
            if (coins >= cost) {
                spendCoin = spendCoin + cost;
                countBar++;
                coins = coins - cost;
            }
        }
        System.out.println(countBar);
    }
    public static void main(String[] args) {
        int[] costs={1,3,2,4,1};
        int coins=7;
        maximumBars(costs,coins);
    }
}
