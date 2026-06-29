package LeetCodeDaily;

import java.util.HashMap;


public class MaxBalloon {
    static void maxBalloon(String s){
        /*
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);
        System.out.println(Math.min(Math.min(b,a),Math.min(Math.min(l,o),n)));
*/
        int[] freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        System.out.println(Math.min(
                            Math.min(freq['b'-'a'],freq['a'-'a']),
                            Math.min(
                                    Math.min(freq['l'-'a']/2,freq['o'-'a']/2),freq['n'-'a'])));
    }
    public static void main(String[] args) {
        String str="nlaebolko";
        maxBalloon(str);
    }
}
