/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 05/10/2020
 */
package math;

import java.sql.Timestamp;
import java.util.Date;

public class Kapitel4Demo {

    public static void main(String[] args) {

        double PI = Math.PI;

        // Math.cos();

        double vinklenRadian = Math.toRadians(180);
        double sinafVinklen = Math.sin(vinklenRadian);
        double cosafVinklem = Math.cos(sinafVinklen);

        for (int i = 0; i < 10000; i++) {
            int tal = (int)Math.ceil(Math.random()*6);
            switch (tal) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                System.out.print(tal + " ");
                break;
                default:
                    System.out.println("Fejl!");
            }

        }


    }
}
