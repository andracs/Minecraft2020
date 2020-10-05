/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Wood {

    private String woodType;  //Type - 1 Oak 2 Dark Oak  3 Birch YAGNI!
    private String skin = "oakwood.png";
    private boolean canBreak = true;

    Wood() {
        System.out.println(Game.visNytObjekt("wood"));
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        // Her kan jeg indbygge noget sikkerhed
        if (woodType.equals("Oak") || woodType.equals("Dark Oak") || woodType.equals("Birch"))
        {this.woodType = woodType;}
        else {
            System.out.println("Forkert woodtype. Det bliver oak alligevel.");
            this.woodType = "Oak";
        }
    }
}
