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

        Dirt dirt1 = new Dirt();
        Dirt dirt2 = new Dirt();
        Dirt dirt3 = new Dirt();
        Dirt dirt4 = new Dirt();

        Wood wood1 = new Wood();
        Wood wood2 = new Wood();
        Wood wood3 = new Wood();
        Wood wood4 = new Wood();

    }

    static String visNytObjekt(String navn) {
        return "En " + navn + " er tilføjet til kortet.";
    }

}
