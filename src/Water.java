/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Water {

    private String waterType;  //Type - 1 blue  2 green  3 transparent YAGNI!
    private String movementType; // Type - 1 flydende 2 fast 3 damp 4 iBevægelse
    private String skin = "water.png";

    Water() {
        System.out.println(Game.visNytObjekt("water"));
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        // Her kan jeg indbygge noget sikkerhed
        if (waterType.equals("blue") || waterType.equals("green") || waterType.equals("transparent"))
        {this.waterType = waterType;}
        else {
            System.out.println("Fuck dig hacker. Det bliver blue alligevel.");
            this.waterType = "blue";
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        // Her kan jeg indbygge noget sikkerhed
        if (movementType.equals("flydende") || movementType.equals("fast") || movementType.equals("damp")  || movementType.equals("iBevaegelse"))
        {this.movementType = movementType;}
        else {
            System.out.println("Fuck dig hacker. Det bliver flydende alligevel.");
            this.movementType = "flydende";
        }
    }

}
