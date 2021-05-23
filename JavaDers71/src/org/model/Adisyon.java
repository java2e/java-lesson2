package org.model;

import java.util.Objects;

public class Adisyon {

    private int id;

    private Musteri musteri;

    private String menuAdi;

    private float fiyat;

    public Adisyon(){

    }

    public Adisyon(int id, Musteri musteri, String menuAdi, float fiyat) {
        this.id = id;
        this.musteri = musteri;
        this.menuAdi = menuAdi;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public String getMenuAdi() {
        return menuAdi;
    }

    public void setMenuAdi(String menuAdi) {
        this.menuAdi = menuAdi;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adisyon adisyon = (Adisyon) o;
        return id == adisyon.id &&
                Float.compare(adisyon.fiyat, fiyat) == 0 &&
                Objects.equals(musteri, adisyon.musteri) &&
                Objects.equals(menuAdi, adisyon.menuAdi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, musteri, menuAdi, fiyat);
    }
}
