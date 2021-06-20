package tr.obs.model;

public class OgrenciDers {

    private Ders ders;

    private Ogrenci ogrenci;

    private int vize;

    private int finalNotu;

    private int ortalama;

    public Ders getDers() {
        return ders;
    }

    public void setDers(Ders ders) {
        this.ders = ders;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinalNotu() {
        return finalNotu;
    }

    public void setFinalNotu(int finalNotu) {
        this.finalNotu = finalNotu;
    }

    public int getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(int ortalama) {
        this.ortalama = ortalama;
    }
}
