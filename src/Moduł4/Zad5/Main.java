package Moduł4.Zad5;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Clock> clocks = new LinkedList<>();
        // TODO Zmienić na bezpośrednie wywołanie jak w poprzednim zadaniu
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

        for (Clock value : clocks) {
            Clock clock = value.changeTime(value);
            System.out.println(clock.getHour() + ":" + clock.getMinute());
        }


    }
}

class Clock {
    private final int hour;
    private final int minute;


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

    public Clock changeTime(Clock clock) {
        int h = clock.getHour();
        int min = clock.getMinute();

        if (h > 23 || h < 0 || min > 59 || min < 0) {
            return new Clock(0, 0);
        }

        if (min == 59 && h != 23) {
            h++;
            min = 0;
        } else if (h == 23 && min == 59) {
            h = 1;
            min = 0;
        } else {
            min++;
        }
        return new Clock(h, min);
    }

}
