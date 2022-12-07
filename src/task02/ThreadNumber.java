package task02;

public class ThreadNumber implements Runnable {

    public void number() {
        for (int i = 0; i < Printer.printMethod(15).size(); i++) {
            Printer.result.add(i, Printer.printMethod(15).get(i));
        }
    }

    @Override
    public void run() {
        number();
    }
}
