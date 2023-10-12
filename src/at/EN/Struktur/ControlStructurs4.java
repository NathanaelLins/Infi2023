package at.EN.Struktur;

import java.util.Random;

public class ControlStructurs4 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
            System.out.println("Zahl 1"); System.out.println(randomNumber);
        int randomNumber2 = random.nextInt(100);
            System.out.println("Zahl 2"); System.out.println(randomNumber2);

        if((randomNumber<randomNumber2) && (randomNumber<50)){
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }   else if((randomNumber<30) || (randomNumber2<30)) {
            System.out.println("Eine der beide ist kleiner als 30");
        }   else if ((randomNumber<50) && (randomNumber2!=50)){
            System.out.println("Este Zahl klein, zweite kein 50iger");
        }

    }
}
