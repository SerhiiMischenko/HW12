package task01;

public class ThreadOne implements Runnable {
    public static long time = 0;
    public static volatile long timesLeft = 0;
    @Override
    public void run() {
        time = Timer.getMillis();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            timesLeft = Math.abs(time - Timer.getMillis()) / 1000;
            System.out.println(timesLeft);
        }
    }
}
