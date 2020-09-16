package Clock01;

import java.time.Clock;

public class Clock02 {
    private Clock01 hour = new Clock01(24);
    private Clock01 minute = new Clock01(60);

    public void start() {
        while (true) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }
    public static void main(String[] args) {
        Clock02 clock = new Clock02();
        clock.start();
    }
}
