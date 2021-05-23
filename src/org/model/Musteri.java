package org.model;

public class Musteri {

    private int id;

    private String adiSoyadi;

    private String adres;

    public Musteri(){}

    public Musteri(int id, String adiSoyadi, String adres) {
        this.id = id;
        this.adiSoyadi = adiSoyadi;
        this.adres = adres;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
