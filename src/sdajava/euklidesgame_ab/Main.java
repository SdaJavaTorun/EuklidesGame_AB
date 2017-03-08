package sdajava.euklidesgame_ab;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random token = new Random();
        int GamerA = token.nextInt(50);
        int GamerB = token.nextInt(50);
        int pozostale = 0;


        System.out.println("Gracz A :" + GamerA + " zetonow");
        System.out.println("Gracz B :" + GamerB + " zetonow");

        while (GamerA !=0 && GamerB != 0) {
            if (GamerA>GamerB) {
                GamerA = GamerA - GamerB;
                System.out.println("Gracz A: " + GamerA);
            }
            else {
                GamerB = GamerB - GamerA;
                System.out.println("Grcz B: " + GamerB);
            }
        }
        pozostale = GamerA + GamerB;
        System.out.println("Koniec gry. Pozostlo  " + pozostale +" zetonow");
    }
}
