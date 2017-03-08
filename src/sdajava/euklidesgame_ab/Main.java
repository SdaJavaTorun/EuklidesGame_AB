package sdajava.euklidesgame_ab;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random token = new Random();
        int GamerA = token.nextInt(100);
        int GamerB = token.nextInt(100);
        int pozostale = 0;
        pozostale = GamerA + GamerB;

        System.out.println("Gracz A :" + GamerA + " żetonów");
        System.out.println("Gracz B :" + GamerB + " żetonów");

        while (GamerA !=0 && GamerB != 0) {
            if (GamerA>GamerB)
            {
                GamerA = GamerA - GamerB;
                System.out.println("Zetony A: " + GamerA);
            }
            else {
                GamerB = GamerB - GamerA;
                System.out.println("Zetony B: " + GamerB);
            }
        }

        System.out.println("Koniec gry. " + pozostale);
    }
}
