/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Dirt {

    private String dirtType;
    private String skin = "wetdirt.png";
    private boolean destroyable = true;
    private int HP = 10;
    // Only hard Block/collision

    public Dirt() {
        System.out.println(Game.visNytObjekt("dirt"));
    }

    public String getDirtType() {
        return dirtType;
    }

    public void setDirtType(String dirtType) {
        this.dirtType = dirtType;
        if (dirtType.equals("Mossy Dirt") || dirtType.equals("Wet Dirt") || dirtType.equals("Dried dirt"))
        {this.dirtType = dirtType;}
        else {
            System.out.println("Fuck dig hacker. Det bliver Dirt alligevel.");
            this.dirtType = "Dirt";
        }
    }
}
