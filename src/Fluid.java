/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Fluid {
    private String fluidType;
    private String skin = "Lava.png";
    private boolean destroyable = false;
    private boolean trigger = true; // triggers an event, allows player/objekts to enter it.


    public Fluid() {
        System.out.println(Game.visNytObjekt("Lava"));
    }

    public String getFluidType() {
        return fluidType;
    }

    public void setFluidType(String fluidType) {
        this.fluidType = fluidType;
        if (fluidType.equals("Water") || fluidType.equals("Lava"))
        {this.fluidType = fluidType;}
        else {
            System.out.println("Fuck dig hacker. Det bliver Water alligevel.");
            this.fluidType = "Water";
        }
    }
    public void Collision(String fluidType1) {
        if (this.fluidType.equals("Lava") && fluidType1.equals("Water")) {
            Obsidian.obsidianCreate();
        }
    }

}
