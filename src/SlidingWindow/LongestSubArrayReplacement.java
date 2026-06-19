package SlidingWindow;

public class LongestSubArrayReplacement {
    static int longestSubStr(String s,int k){
        s=s.toUpperCase();
        int[] freq=new int[26];
        int left=0;
        int maxLen=Integer.MIN_VALUE;
        int maxFreq=0;

        for(int right=0;right<s.length();right++){
            char current=s.charAt(right);
            freq[current-'A']++;

            maxFreq=Math.max(maxFreq,freq[current-'A']);


            while ((right-left+1)-maxFreq>k){
                char leftChar=s.charAt(left);
                freq[leftChar-'A']--;

                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s="aababbc";
        int k=1;
        System.out.println(longestSubStr(s,k));
    }
}
