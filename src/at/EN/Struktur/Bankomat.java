package at.EN.Struktur;

import java.util.Scanner;

public class Bankomat {
    private static double kontostand = 0; // Beispiel-Kontostand

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

        System.out.println("Bankomat-Simulator");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");
        System.out.print("Wähle eine Option: ");

        while (weiter) {


            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    einzahlen(scanner);
                    break;
                case 2:
                    abheben(scanner);
                    break;
                case 3:
                    kontostandAnzeigen();
                    break;
                case 4:
                    System.out.println("Vielen Dank, dass Sie unseren Bankomat benutzt haben.");
                    weiter = false;
                    break;
                default:
                    System.out.println("Ungültige Option. Bitte wählen Sie erneut.");
                    break;
            }
        }
        scanner.close();
    }

    private static void einzahlen(Scanner scanner) {
        System.out.print("Geben Sie den Einzahlungsbetrag ein: ");
        double betrag = scanner.nextDouble();
        if (betrag > 0) {
            kontostand += betrag;
            System.out.println("Einzahlung erfolgreich. Neuer Kontostand: " + kontostand);
        } else {
            System.out.println("Ungültiger Betrag. Bitte geben Sie einen positiven Betrag ein.");
        }
    }

    private static void abheben(Scanner scanner) {
        System.out.print("Geben Sie den Abhebungsbetrag ein: ");
        double betrag = scanner.nextDouble();
        if (betrag > 0 && betrag <= kontostand) {
            kontostand -= betrag;
            System.out.println("Abhebung erfolgreich. Neuer Kontostand: " + kontostand);
        } else {
            System.out.println("Ungültiger Betrag oder nicht genügend Guthaben.");
        }
    }

    private static void kontostandAnzeigen() {
        System.out.println("Ihr aktueller Kontostand beträgt: " + kontostand);
    }
}
