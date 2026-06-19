package LeetCodeDaily;

public class HighestAltitude {
    public static void highestAltitude(int[] arr){
        int current=0;
        int maxAltitude=0;
        for (int i = 0; i <arr.length; i++) {
            current=current+arr[i];
            if(current>maxAltitude){
                maxAltitude=current;
            }
        }
        System.out.println(maxAltitude);
    }
    public static void main(String[] args) {
     int[] arr={-4,-3,-2,-1,4,3,2};
     highestAltitude(arr);
    }
}
