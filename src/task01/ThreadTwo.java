package task01;

public class ThreadTwo implements Runnable {

    @Override
    public void run() {
       while (true) {
           if(ThreadOne.timesLeft % 5 == 0 && ThreadOne.timesLeft >= 5) {
               System.out.println("Five");
           }
       }
    }
}
