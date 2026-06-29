package LeetCodeDaily;

public class LT1967 {
    static int numberOfStr(String[] pattern,String word){
        int count=0;
        for(String value:pattern){
         if(word.contains(value)){
         count++;
         }
        }
        return count;
    }
    public static void main(String[] args) {
    String [] pattern={"a","ab","d","abc"};
    String word="abc";
        System.out.println(numberOfStr(pattern,word));
    }
}
