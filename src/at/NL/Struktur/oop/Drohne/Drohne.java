package at.NL.Struktur.oop.Drohne;

public class Drohne {

    private String model;
    private String art;
    private int alter;
    private String farbe;
    private String name;

    public Drohne() {
    }

    public Drohne(String model, String art, int alter, String farbe, String name) {
        this.model = model;
        this.art = art;
        this.alter = alter;
        this.farbe = farbe;
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Das ist eine " + this.art +
                " " + this.model +
                ", Alter: " + this.alter +
                ", Farbe: " + this.farbe +
                ", name: " + this.name);
    }
}
