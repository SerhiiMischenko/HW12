package task02;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadNumber = new Thread(new ThreadNumber());
        threadNumber.start();
        threadNumber.join();

        Thread threadFizz = new Thread(new ThreadFizz());
        threadFizz.start();
        threadFizz.join();

        Thread threadBuzz = new Thread(new ThreadBuzz());
        threadBuzz.start();
        threadBuzz.join();

        Thread threadFizzBuzz = new Thread(new ThreadFizzBuzz());
        threadFizzBuzz.start();
        threadFizzBuzz.join();


        System.out.println(Printer.resultPrint());
    }
}
