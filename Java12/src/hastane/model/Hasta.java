package hastane.model;
// id,adi,soyadi,tcno,yasi,adres
public class Hasta extends BaseModel{

    private String adi;

    private String soyadi;

    private String tcNo;

    private int yasi;

    private String adres;

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

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return getId()+":"+this.adi+":"+this.soyadi+":"+this.tcNo+":"+this.yasi+":"+this.adres;
    }
}
