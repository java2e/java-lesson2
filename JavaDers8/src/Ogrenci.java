import java.util.Objects;

public class Ogrenci {

    private int id;

    private String adi;

    public Ogrenci(int id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return id == ogrenci.id &&
                Objects.equals(adi, ogrenci.adi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adi);
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                '}';
    }
}
