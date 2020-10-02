/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Game {

    static void start(){
        System.out.println("Spillet starter.");

        Sheep martha = new Sheep();

        for (int i = 0; i < 4; i++) {
            Dirt dirt = new Dirt();
        }

        for (int i = 0; i < 4; i++) {
            Wood wood = new Wood();
            wood.setWoodType("Oak");
        }
        for (int i = 0; i < 2; i++) {
            Flower flower = new Flower();
        }


    }

    static String visNytObjekt(String navn) {
        return "En " + navn + " er tilføjet til kortet.";
    }

}
