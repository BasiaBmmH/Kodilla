package Moduł4.Zad4;

import groovy.console.ui.AstBrowser;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Cannon> cannons = new LinkedList<>();

        Cannon cannon0 = new Cannon(true);
        Cannon cannon1 = new Cannon(true);
        Cannon cannon2 = new Cannon(false);
        Cannon cannon3 = new Cannon(false);
        Cannon cannon4 = new Cannon(true);
        Cannon cannon5 = new Cannon(false);

        cannons.add(cannon0);
        cannons.add(cannon1);
        cannons.add(cannon2);
        cannons.add(cannon3);
        cannons.add(cannon4);
        cannons.add(cannon5);

        for (int i = 0; i < cannons.size() - 1; i++) {
            cannons.get(i).fire();
        }

    }
}

class Cannon {
    private boolean loaded;

    Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if (loaded) {
            System.out.println("Armata zaladowana");
        } else {
            System.out.print("Brak kuli w armacie   ładowanie...");
            loaded = true;
            System.out.print("   Armata zaladowana");
            System.out.println();
        }
    }
}
