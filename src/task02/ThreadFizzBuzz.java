package task02;

public class ThreadFizzBuzz implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < Printer.printMethod(15).size() -1; i++) {
            System.out.println();
            if (Integer.parseInt(Printer.printMethod(15).get(i)) % 5 == 0 && Integer.parseInt(Printer.printMethod(15).get(i)) % 3 == 0) {
                Printer.result.remove(i);
                Printer.result.add(i, "Fizzbuzz");
            }

        }
    }
}
