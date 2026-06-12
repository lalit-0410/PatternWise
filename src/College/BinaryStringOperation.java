package College;

public class BinaryStringOperation {
    public static void main(String[] args) {
        String s="10111101";
        binary(s);
    }

    private static void binary(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <n-1 ; i++) {
            if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                continue;
            }
            else {
                sb.append(s.charAt(i));
            }

        }
        sb.append(s.charAt(n-1));
        System.out.println(sb.toString());
    }
}
