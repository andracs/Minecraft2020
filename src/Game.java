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

        Wood wood1 = new Wood();
        Wood wood2 = new Wood();
        Wood wood3 = new Wood();
        Wood wood4 = new Wood();

        wood1.setWoodType("Oak");

        Player steve = new Player();
        //steve.egenskaber.gender = "Æææh";
        //steve.egenskaber.level = 100;

        Sheep får = new Sheep();
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



        // 3d verden
        // x,y,z = Flower
    }

    static String visNytObjekt(String navn) {
        return "En " + navn + " er tilføjet til kortet.";
    }

}
