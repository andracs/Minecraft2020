/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/10/2020
 */

public class Sheep {

    Head head;
    Body body;
    Feet foot1, foot2, foot3, foot4;
    int health = 10;
    int damageTaken = 0;
    boolean damage = false;

    Sheep() {
        System.out.println(Game.visNytObjekt("sheep"));
    }

    private int healthRemaining(int currentHealth) {
        if (damage = true) {
            health = currentHealth - damageTaken;
        }
        else {
            health = currentHealth;
        }
        return health;
    }



}
