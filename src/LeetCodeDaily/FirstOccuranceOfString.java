package LeetCodeDaily;

public class FirstOccuranceOfString {
    public static int firstOccurance(String str,String find){
        int n = str.length();
        int m = find.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m &&str.charAt(i + j) == find.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s="sadbutsad";
        String f="sad";
        System.out.println(firstOccurance(s,f));
    }
}
