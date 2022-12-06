package task01;

public class ThreadTwo implements Runnable {

    @Override
    public synchronized void run() {
       while (true) {
           if(ThreadOne.timesLeft % 5 == 0 && ThreadOne.timesLeft >= 5) {
               System.out.println("Five");
               try {
                   wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           notify();
       }
    }
}
