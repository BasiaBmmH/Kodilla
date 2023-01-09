package Modul3.Zad3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int sumaA = 1000;
        int sumaB = 0;
        int counter = 0;

        while (sumaA > sumaB) {
            sumaA = randomGenerator.nextInt(10) + sumaA;
            sumaB = randomGenerator.nextInt(50) + sumaB;
            System.out.println("sumaA: " + sumaA);
            System.out.println("sumaB: " + sumaB);
            counter++;
            System.out.println("Numer przebiegu peli: " + counter);
        }
        System.out.println("sumaA < sumaB " + sumaA + " < " + sumaB);


        //TODO Napisz program, który wypisze wszystkie liczby podzielne
        // przez 3 (bez reszty) z zakresu od 0 do 100 (obustronnie włącznie).
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if(i%3==0){
                System.out.print(i + " ");
            }
        }


    }
}
