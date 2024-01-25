package at.NL.Struktur.oop.Drohne;

import java.util.ArrayList;

public class Luft {
    private int luftfeuchtigkeit;
    private String adresse;
    private int höhe;
    private int maxdrohneinluft;
    private ArrayList<Drohne> drohneListe;

    public Luft(int luftfeuchtigkeit, String adresse, int höhe, int maxdrohneinluft) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.adresse = adresse;
        this.höhe = höhe;
        this.drohneListe = new ArrayList<>();
        this.maxdrohneinluft = maxdrohneinluft;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(int luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getHöhe() {
        return höhe;
    }

    public void setHöhe(int höhe) {
        this.höhe = höhe;
    }

    public int getMaxdrohneinluft() {
        return maxdrohneinluft;
    }

    public void setMaxdrohneinluft(int maxdrohneinluft) {
        this.maxdrohneinluft = maxdrohneinluft;
    }

    public void getInfo() {
        System.out.println("Adresse: " + this.adresse + "\nLuftfeuchtigkeit: " + this.luftfeuchtigkeit + "\nHöhe: " + this.höhe);
    }

    public void addDrohne(Drohne drohne) {
        if (drohneListe.size()  > (this.maxdrohneinluft-1)){
            System.out.println("Der/die Pilot/in will nicht mehr Drohnen als " + this.maxdrohneinluft + " in der Luft!!");
        } else {
            drohneListe.add(drohne);
        }
    }

    public void getKatzeImHaus(){
        for (Drohne d : drohneListe){
            d.getInfo();
        }
    }

    public void getdrohneinluft() {
    }
}
