/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Flower {

    private String flowerType;  //Type - 1 red 2 blue 3 yellow 4 white
    private String skin = "flower.png";
    private boolean canBreak = true;
    private boolean canStack = true;
    private boolean canGrow = true;
    private boolean canBurn = true;
    private boolean needsGrass = true;

    Flower() {
        System.out.println(Game.visNytObjekt("wood"));
    }

    public String getFlowerType() {
        return flowerType;
    }

    public void setFlowerType(String flowerType) {
        // Her kan jeg indbygge noget sikkerhed
        if (flowerType.equals("red") || flowerType.equals("blue") || flowerType.equals("yellow") || flowerType.equals("white"))
        {this.flowerType = flowerType;}
        else {
            System.out.println("Jeg kan bedre lide røde blomster");
            setFlowerType("red");
        }
    }
}
