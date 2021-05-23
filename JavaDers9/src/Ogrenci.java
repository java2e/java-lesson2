import java.util.Objects;

public class Ogrenci {

    private int id;
    private String ogrenciAdi;

    public Ogrenci(int id, String ogrenciAdi) {
        this.id = id;
        this.ogrenciAdi = ogrenciAdi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return id == ogrenci.id &&
                Objects.equals(ogrenciAdi, ogrenci.ogrenciAdi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ogrenciAdi);
    }
}
