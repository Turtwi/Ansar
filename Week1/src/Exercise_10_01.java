package HW_week_1;

public class Exercise_10_01 {
    public static void main(String[] args) {
        Time currentTime = new Time();
        Time time2 = new Time(555550000);

        System.out.println(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        time2.setTime(100000000);
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
    }
}