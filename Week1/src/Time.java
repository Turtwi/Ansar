package HW_week_1;

public class Time {

      private int Hour;
      private int Minute;
      private int Second;
      private long time;

    public Time() {
        Time = System.currentTimeMillis();
    }

    public Time(long time) {
        Time = time;
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        return;
    }

    public void setTime(long time) {
        time = time;
    }

    public int getHour() {
        return (int)(time / (1000 * 3600)) % 24;
    }

    public int getMinute() {
        return (int)(time / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int)(time / 1000) % 60;
    }
}
