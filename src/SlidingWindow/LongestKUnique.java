package SlidingWindow;

import java.util.HashMap;

public class LongestKUnique {
    static int longestKCharacterUnique(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxLen=-1;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()==k){
                int len=right-left+1;
                maxLen=Math.max(len,maxLen);
            }
            while (map.size()>k){
                char leftch=s.charAt(left);
                map.put(leftch,map.get(leftch)-1);
                if(map.get(leftch)==0){
                    map.remove(leftch);
                }
                    left++;
                }
            }

        return maxLen;
    }
    public static void main(String[] args) {
        String s="aabacbebebe";
        int k=3;
        System.out.println(longestKCharacterUnique(s,k));
    }
}
