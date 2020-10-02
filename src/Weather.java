import java.util.Random;

public class Weather {

    /*
    Sol = 1
    Regn = 2
    Sne = 3
    Beskyet = 4
    */
    static Random random = new Random();
    static int elapsedtime = 1;

    public static void changeWeather() throws InterruptedException {
        while (elapsedtime != 0) {
            int weather = random.nextInt((4 - 1) + 1) + 1;



            Thread.sleep(1);
        elapsedtime--;

        if (elapsedtime == 0) {
            switch (weather) {
                case 1:
                    System.out.println("Sol");
                    break;
                case 2:
                    System.out.println("Beskyet");
                    break;
                case 3:
                    System.out.println("Sne");
                    break;
                case 4:
                    System.out.println("Regn");
            }
            elapsedtime = 10000;
        }
    }

    }

}
