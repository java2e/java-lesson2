package org.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musteri musteri = (Musteri) o;
        return id == musteri.id &&
                Objects.equals(adiSoyadi, musteri.adiSoyadi) &&
                Objects.equals(adres, musteri.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adiSoyadi, adres);
    }
}
