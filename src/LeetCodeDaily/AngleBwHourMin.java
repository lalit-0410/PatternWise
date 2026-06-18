package LeetCodeDaily;

public class AngleBwHourMin {
    public static double angleClock(int hour, int minutes) {
        double angleH=0;
        double angleM=0;


            angleH=(hour%12)*30+(minutes*0.5);


            angleM=minutes%60*6;


        double angle=Math.abs(angleH-angleM);
        if(angle>180){
            angle=360-angle;
        }

        return angle;
    }
    public static void main(String[] args) {
        System.out.println(angleClock(3,30));
    }
}
