package at.NL.Struktur.oop.Drohne;


import java.util.ArrayList;
import java.util.Random;

public class Testit2 {

    public static void main(String[] args){
        Random r = new Random();
        ArrayList<Drohne> mDrohneListe = new ArrayList();
        Drohne drohne = new Drohne();
        String[] modelListe ={"fpv","dji"};
        String[] artListe ={"weich","hart","nass","hässlich","Elias Frisur","wie Elias hässlich"};
        String[] namenListe ={"Elias","Elija","Marvin","Dine Mom","Non-Binare","Kratzer in Elijas Handy"};
        String[] farbeListe ={"weiß","schwarz","beides","alles","rainbow","hässlich"};


        for (int i=1; i<=100; i++){
            int ci = r.nextInt(modelListe.length - 1 -0)+0;
            int oi = r.nextInt(artListe.length - 1 -0)+0;
            int ni = r.nextInt(namenListe.length - 1 -0)+0;
            int fi = r.nextInt(farbeListe.length - 1 -0)+0;
            int ai = r.nextInt(25 + 1 -0)+0;
            mDrohneListe.add(new Drohne(modelListe[ci],artListe[oi],ai,farbeListe[fi],namenListe[ni]));

        }
        mDrohneListe.add(drohne);
        drohne.setAlter(1);
        drohne.setModel("fpv");
        drohne.setFarbe("karriert");
        drohne.setArt("flauschig");
        drohne.setName("Mitzi");

        Drohne drohne2 = new Drohne("nette","nackt",5,"rosa","Nackibutz");
        mDrohneListe.add(drohne2);
        // System.out.println("Meine Katze "+katze.getName() +" ist "+ katze.getAlter() + " alt!");

        int drohnenzaehler = 1;

        Luft luft = new Luft (350, "Buxdehude 4, 388732 Hamburg", 8, 5);
        luft.getInfo();


        for(Drohne k: mDrohneListe){
            System.out.println("Meine Drohne "+k.getName() +" ist "+ k.getAlter() + " alt," + k.getModel() + ", "+k.getName() + ", " + k.getArt());
            luft.addDrohne(k);
        }
        luft.getdrohneinluft();
    }

}
