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
    boolean movingFront = false;
    boolean movingBack = false;
    boolean movingRight = false;
    boolean movingLeft = false;
    boolean jumping = false;

    Sheep() {
        System.out.println(Game.visNytObjekt("sheep"));
    }

    private int healthRemaining(int currentHealth) {
        if (damage == true) {
            health = currentHealth - damageTaken;
        }
        else {
            health = currentHealth;
        }
        return health;
    }

    void MoveForward(int positionX) {
        while (movingFront == true) {
            positionX++;
        }
    }
    void MoveBackwards(int positionX) {
        while (movingBack == true) {
            positionX--;
        }
    }
    void MoveRight (int positionZ) {
        while (movingRight == true) {
            positionZ++;
        }
    }
    void MoveLeft (int positionZ) {
        while (movingLeft == true) {
            positionZ++;
        }
    }
    void Jump (int positionY) {
        while (jumping == true) {
            positionY++;
        }
        for (int i = positionY; i < 0; i--) {
            positionY--;
        }
    }



}
