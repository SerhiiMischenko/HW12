package task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Printer {
    public static List<String> result = new ArrayList();

    public static synchronized List<String> printMethod(int counter) {
        int count = counter;
        ArrayList<Integer> list = new ArrayList<>();
        while (count > 0) {
            list.add(count);
            count--;
        }
        Collections.sort(list);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= list.size() -1; i++) {
            result.add(String.valueOf(list.get(i)));
        }
        return result;
    }

    public static String resultPrint() {
        String temp = "";
        for (String s : result) {
            temp += s + ", ";
        }
        return temp.substring(0, temp.length() - 2);
    }
}
