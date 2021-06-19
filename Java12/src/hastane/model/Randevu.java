package hastane.model;

import java.util.Date;

public class Randevu extends BaseModel {

    private Date randevuTarih;

    private Doktor doktor;

    private Hasta hasta;

    public Date getRandevuTarih() {
        return randevuTarih;
    }

    public void setRandevuTarih(Date randevuTarih) {
        this.randevuTarih = randevuTarih;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
}
