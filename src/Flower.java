/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Flower {

    private String flowerType; //Type: rose and dandelion
    private String skin = "flower.png";
    private boolean canBreak = true;

    Flower() {
        System.out.println(Game.visNytObjekt("flower"));
    }

    public String getFlowerType() { return flowerType;}

    public void setFlowerType() {
        if (flowerType.equals("Rose") || (flowerType.equals("Dandelion"))) {
            this.flowerType = flowerType;
        }
        else {
            this.flowerType = "flower.png";
        }
    }
}
