/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Dirt {

    private String dirtType; // Typer: fast, tørt, frossen, med græs.

    public Dirt() {
        System.out.println(Game.visNytObjekt("dirt"));
    }

    public String getDirtType() {
        return dirtType;
    }

    public void setDirtType(String dirtType) {
        // Her kan jeg indbygge noget sikkerhed
        if (dirtType.equals("fast") || dirtType.equals("toert") || dirtType.equals("frossen")  || dirtType.equals("medGraes"))
        {this.dirtType = dirtType;}
        else {
            System.out.println("Fuck dig hacker. Det bliver fast alligevel.");
            this.dirtType = "fast";
        }
    }



}
