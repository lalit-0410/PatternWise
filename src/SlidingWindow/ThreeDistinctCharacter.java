package SlidingWindow;

public class ThreeDistinctCharacter {
    public static void main(String[] args) {
        String s="xyzxxyz";
        System.out.println(threeDistinctCharacter(s));
    }

    private static int threeDistinctCharacter(String s) {
        int left=0;
        int right=2;
        int count=0;
        while (right<s.length()){
            char a=s.charAt(left);
            char b=s.charAt(left+1);
            char c=s.charAt(right);

            if(a!=b &&  b!=c && c!=a)
            {
                count++;
            }
            left++;
            right++;
        }
        return count;
    }
}
