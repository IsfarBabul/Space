public class Time {
    private int seconds;
    private int minutes;
    private int hours;
    public Time(int hours, int minutes, int seconds) {
        this.seconds  = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public int getSeconds() {
        return seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getHours() {
        return hours;
    }
    public void tick()  {
        seconds += 1;
        if (seconds == 60) {
            minutes++;
            seconds = 0;
        }
        if (minutes == 60) {
            hours++;
            minutes = 0;
        }
        if (hours == 24) {
            hours = 0;
        }
    }
    public void add(Time addTime) {
        int seconds = 0;
        seconds += addTime.getSeconds();
        seconds += addTime.getMinutes() * 60;
        seconds += addTime.getHours() * 3600;
        for (int i = 0; i < seconds; i++) {
            tick();
        }
    }
    public String info() {
        String display = "";
        if (hours < 10) {
            display += "0";
        }
        display += hours + ":";
        if (minutes < 10) {
            display += "0";
        }
        display += minutes + ":";
        if (seconds < 10) {
            display += "0";
        }
        display += seconds;
        return display;
    }
}
