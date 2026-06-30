package LeetCodeDaily;

import java.util.HashMap;

public class LT1358 {
    public static int numberOfSubstrings(String s){
        int count=0;
        int low=0;
        int n=s.length();
        int k=3;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int high=0;high<n;high++){
            char ch=s.charAt(high);

            map.put(ch,map.getOrDefault(ch,0)+1);

            while (map.size()==k){
                count=count+n-high;
                char l=s.charAt(low);
                map.put(l,map.get(l)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                low++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str="aaacb";
        System.out.println(numberOfSubstrings(str));
    }
}
