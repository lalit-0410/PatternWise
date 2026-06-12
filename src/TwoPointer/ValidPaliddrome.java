package TwoPointer;

public class ValidPaliddrome {
    static boolean palindrome(String s){
        s=s.toLowerCase();
        char[] chars=s.toCharArray();
        int left=0;
        int right=s.length()-1;

        while (left<right){
        //check for non alphabet character ==> skip
        while (left<right && !Character.isLetterOrDigit(chars[left])){
            left++; //skip kr dega
        }
            while (left<right && !Character.isLetterOrDigit(chars[right])){
                right--; //skip kr dega
            }

            //compare
            if(chars[left]!=chars[right]){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static void main(String[] args) {
        String s="A man, A plan, A canal:Panama";
        System.out.println(palindrome(s));
    }
}
