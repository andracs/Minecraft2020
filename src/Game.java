/**
 * Developed by András Ács (acsandras@gmail.com) Zealand / www.zealand.dk
 * Licensed under the MIT License 02/10/2020
 */

public class Game {

    static void start() {
        int idCounter = 1;
        System.out.println("Spillet starter.");

        for (int i = 0; i < 300; i++) {
            new Item(idCounter, "Dirt", "dirt.png", 8, false, "Dirt");
            idCounter++;
        }
        for (int i = 0; i < 70; i++) {
            new Item(idCounter, "Oak", "oak.png", 8, false, "Oak");
            idCounter++;
        }
        for (int i = 0; i < 7; i++) {
            new Item(i, "Diamond Ore", "diamondOre.png", 100, false, "Diamond");
            idCounter++;
        }
        System.out.println("Verden er genereret.");
    }

    static String visNytObjekt(String navn) {
        return "En " + navn + " er tilføjet til kortet.";
    }

}
