package Moduł4.Zad5;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Clock> clocks = new LinkedList<>();

        Clock clock0 = new Clock(12, 22);
        Clock clock1 = new Clock(1, 31);
        Clock clock2 = new Clock(7, 20);
        Clock clock3 = new Clock(18, 50);
        Clock clock4 = new Clock(16, 15);
        Clock clock5 = new Clock(24, 59);
        Clock clock6 = new Clock(17, 59);

        clocks.add(clock0);
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);
        clocks.add(clock5);
        clocks.add(clock6);

        for (int i = 0; i < clocks.size(); i++) {
            clocks.get(i).changeTime(clocks.get(i));
        }


    }
}

class Clock {
    private int hour;
    private int minute;


    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void changeTime(Clock clock) {
        int h = clock.getHour();
        int min = clock.getMinute();
        if (min == 59 && h != 24) {
            h++;
            min = 0;
        } else if (h == 24 && min == 59) {
            h = 1;
            min = 0;
        } else if (min == 59) {
            h++;
            min = 0;
        } else {
            min++;
        }
        System.out.println(h + ":" + min);
    }

}
