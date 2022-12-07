package task01;

public class ThreadTwo implements Runnable {
    public long buffer = 0;

    @Override
    public synchronized void run() {
       while (true) {
           long threadOne = ThreadOne.timesLeft;
           if(threadOne % 5 == 0 && threadOne >= 5 && threadOne != buffer) {
               System.out.println("Five seconds left.");
               buffer = threadOne;
           }
       }
    }
}
