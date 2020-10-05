/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Sheep {

    Stats stats = new Stats();
    Head head;
    Body body;
    Feet foot1, foot2, foot3, foot4;

    Sheep() {
        System.out.println(Game.visNytObjekt("sheep"));
        show();

        this.stats.x=(int)(Math.random()*200-100);
        System.out.println("Fåret er på X: " + this.stats.x);
        this.stats.y=(int)(Math.random()*200-100);
        System.out.println("Fåret er på Y: " + this.stats.y);
        this.stats.z=(int)(Math.random()*3+1);
        System.out.println("Fåret er på Z: " + this.stats.z);

    }

    void show() {
        System.out.println();
        System.out.println("            _.%%%%%%%%%%%%%\n" +
                "            /- _%%%%%%%%%%%%%\n" +
                "           (_ %\\|%%%%%%%%%%%%\n" +
                "              %%%$$$$$$$$$$$%\n" +
                "                S%S%%%*%%%%S\n" +
                "            ,,,,# #,,,,,,,##,,,,,");
        System.out.println();
    }

    /* depracated */
    void gåVinkel() {
        // Får gå random antal skridt i en retning
        int retning = (int)(Math.random()*360);
        int antalSkridt = (int)(Math.random()*5);
        System.out.printf(
                "Fåret går %d skridt i retning %d", antalSkridt, retning);

    }

    void gåXY() {
        // Får gå random (0..2) antal skridt i en retning x eller y
        if (Math.random()>0.5) { this.stats.x += (int)(Math.random()*7)-3;}
        else {this.stats.y += (int)(Math.random()*7)-3;}
        System.out.println("Fåret er nu på " + stats.x + " -  " + stats.y);

    }



}
