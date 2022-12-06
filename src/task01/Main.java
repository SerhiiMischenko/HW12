package task01;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new ThreadOne();
        Thread thread = new Thread(runnable);
        thread.start();
        Runnable runnable2 = new ThreadTwo();
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
