package Moduł4.Zad2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, List<String>> orders = new HashMap<>();
        orders.put(1, Collections.singletonList("sth1, sth1"));
        orders.put(2, Collections.singletonList("sth2, sth2"));
        orders.put(3, Collections.singletonList("sth3, sth3"));
        orders.put(1, Collections.singletonList("sth3, sth3"));

        System.out.println("ilosc zamwien: " + orders.size());
        System.out.println("numery zamowien: ");
        for (Map.Entry<Integer, List<String>> entry :orders.entrySet()) {
            System.out.println("Nr zamowienia: " + entry.getKey() + " Co zamowiono " + entry.getValue());
        }

    }
}


