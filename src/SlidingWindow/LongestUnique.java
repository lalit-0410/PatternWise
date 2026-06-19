package SlidingWindow;

import java.util.HashMap;

public class LongestUnique {
    static int longest(String s){
        int left=0;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int right=0;right<s.length();right++){

            char ch=s.charAt(right);

            map.put(ch,map.getOrDefault(ch,0)+1);
            int k=right-left+1; //size

            while (map.size()<k) {//duplicate repeat
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;

                k = right - left + 1;
            }
            maxLen = Math.max(maxLen,k);

        }
        return maxLen;
    }
    public static void main(String[] args) {

            String s = "abcabcbb";

            System.out.println(longest(s));
    }
}
