package task02;

public class ThreadFizz implements Runnable {
    public void fizz() {
        for (int i = 0; i < Printer.printMethod(15).size(); i++) {
            if (Integer.parseInt(Printer.printMethod(15).get(i)) % 3 == 0 && Integer.parseInt(Printer.printMethod(15).get(i)) % 5 != 0) {
                Printer.result.remove(i);
                Printer.result.add(i, "Fizz");
            }
        }
    }
    @Override
    public void run() {
        fizz();
    }
}
