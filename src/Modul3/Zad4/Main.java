package Modul3.Zad4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Deque<String> aWordsDeque = new ArrayDeque<>();

        Random randomGenerator = new Random();
        for (int i = 0; i < 50; i++) {
            int randomNumber = randomGenerator.nextInt(1, 51);
            // TODO Zrealizować za pomocą pętli for
            aWordsDeque.offer("a".repeat(randomNumber));
        }
        AGroupHolder aGroupHolder = aWordsSeparator(aWordsDeque);
        System.out.println(aGroupHolder);
        System.out.println("Deque results: " + aWordsDeque);
    }
}
