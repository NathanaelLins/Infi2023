package at.NL.Struktur;

import java.util.Random;

public class ControlStructurs8 {
    public static void main(String[] args) {

        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished) {
            int randomValue = random.nextInt(10, 30);

            if(randomValue==15){
                isFinished = true;


                System.out.println(15);
            }else if(randomValue==25){
                isFinished = true;



                System.out.println(25);
            }
//Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
// Das Programm soll die Zufallszahlen zusammenzählen.
// Sobald die Zahl 15 oder die Zahl 25 kommt, wird das
// Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!

        }
    }
}