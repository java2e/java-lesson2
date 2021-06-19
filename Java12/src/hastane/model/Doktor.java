package hastane.model;
//id,adi,soyadi,sicil,bolum
public class Doktor extends BaseModel {

    private String adi;

    private String soyadi;

    private String sicilNo;

    private Bolum bolum; // Enum

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return getId()+":"+this.adi+":"+this.soyadi+":"+this.sicilNo+":"+this.bolum.text;
    }
}
