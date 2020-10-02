/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Game {

    static void start() throws InterruptedException {
        System.out.println("Spillet starter.");


        Obsidian.obsidianCreate();
        Sheep martha = new Sheep();

        for (int i = 0; i < 4; i++) {
            Dirt dirt = new Dirt();
        }

        Wood wood1 = new Wood();
        Wood wood2 = new Wood();
        Wood wood3 = new Wood();
        Wood wood4 = new Wood();

        wood1.setWoodType("Oak");
        wood1.hit(2);
        wood1.hit(3);
        wood1.hit(3);
        wood1.hit(2);
        Weather.changeWeather();
    }

    static String visNytObjekt(String navn) {
        return "En " + navn + " er tilføjet til kortet.";
    }

}
