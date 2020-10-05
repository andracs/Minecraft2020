/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Game {

    static void start() {
        System.out.println("Spillet starter.");
        // demo();

        // Får gå random antal skridt i en retning
        Sheep herman = new Sheep();
        herman.stats.name = "Herman";
        herman.gåXY();

        // Liv, skade random

        // Random træer


        // TODO 3d verden
        // TODO x,y,z = Flower
    }

    static String visNytObjekt(String navn) {
        return "En " + navn + " er tilføjet til kortet.";
    }

    static void demo() {

        Sheep martha = new Sheep();

        for (int i = 0; i < 4; i++) {
            Dirt dirt = new Dirt();
        }

        Wood wood1 = new Wood();
        Wood wood2 = new Wood();
        Wood wood3 = new Wood();
        Wood wood4 = new Wood();

        wood1.setWoodType("Oak");

        Player steve = new Player();
        // Hvis man ikke i Player klassen instatierer Stats objektet får vi fejl
        // Derfor er nedenstående udkommenteret
        //steve.egenskaber.gender = "Æææh";
        //steve.egenskaber.level = 100;

        Sheep får = new Sheep();
        // Jeg har rettet Sheep, som instansierer en
        får.stats.gender = "Dreng";
        får.stats.hp = 10;

        Flower flower1 = new Flower();
        System.out.println(flower1.size);
        flower1.grow();
        System.out.println(flower1.size);
        flower1.grow();
        System.out.println(flower1.size);
        flower1.wither();
        System.out.println(flower1.size);
        flower1.wither();
        System.out.println(flower1.size);
        flower1.wither();
        System.out.println(flower1.size);

    }
}
