package at.NL.Struktur;

import java.util.Random;

public class ControlStructurs3 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        if(randomNumber<20){
            System.out.println("MINI");
        }else if((randomNumber>20) && (randomNumber<50)){
            System.out.println("MEDIUM");
        }else{
            System.out.println("LARGE");
        }


    }
}
