package at.EN.Struktur;

import java.util.Random;

public class Würfelspiel {
    public static void main(String[] args) {

        Random random = new Random();

        int winsOfPlayer = 0;
        int winsOfComputer = 0;
        int amountOfDraws = 0;

        for (int i = 0; i < 6; i++) {
            int randomPlayer = random.nextInt(6) + 1;
            int randomComputer = random.nextInt(6) + 1;

            if (randomPlayer>randomComputer){
                winsOfPlayer++;
            }   else if (randomPlayer<randomComputer){
                winsOfComputer++;
            }   else {
                amountOfDraws++;
            }
            System.out.println();
            System.out.println("Computer:" + randomComputer);
            System.out.println("Player:" + randomPlayer);
        }
        System.out.println();
        System.out.println("Computer Wins:" + winsOfComputer);
        System.out.println("Player Wins:" + winsOfPlayer);
        System.out.println("Draws" + amountOfDraws);
    }
}