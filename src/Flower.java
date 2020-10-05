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
    int size = 1; // 1..2

    Flower() {
        System.out.println(Game.visNytObjekt("flower"));
        show();
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

    void grow() {
        if (size==1) System.out.println("Planten vokser");
        else System.out.println("Planten er ellerede max størrelse.");
        size = 2;
    }

    void wither() {
        if (size<=0) System.out.println("Planten er kaput.");
        else System.out.println("Planten visner.");
        size = size - 1;
    }

    void show() {
        System.out.println();
        System.out.println("             .-.'  '.-.\n" +
                "          .-(   \\  /   )-.\n" +
                "         /   '..oOOo..'   \\\n" +
                " ,       \\.--.oOOOOOOo.--./\n" +
                " |\\  ,   (   :oOOOOOOo:   )\n" +
                "_\\.\\/|   /'--'oOOOOOOo'--'\\\n" +
                "'-.. ;/| \\   .''oOOo''.   /\n" +
                ".--`'. :/|'-(   /  \\   )-'\n" +
                " '--. `. / //'-'.__.'-;\n" +
                "   `'-,_';//      ,  /|\n" +
                "        '((       |\\/./_\n" +
                "          \\\\  . |\\; ..-'\n" +
                "           \\\\ |\\: .'`--.\n" +
                "            \\\\, .' .--'\n" +
                "             ))'_,-'`\n" +
                "            //-'\n" +
                "           // \n" +
                "          //\n" +
                "         |/");
        System.out.println();
    }


}