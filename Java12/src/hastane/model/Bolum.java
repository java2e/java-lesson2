package hastane.model;

public enum Bolum {

    COCUK_HASTALIKLARI(1,"Cocuk Hastalıkları"),
    GENEL_HASTALIKLAR(2,"Genel Hastalıklar"),
    DERMATAOLOJI(3,"Dermataloji"),
    KARDIYOLOJI(4,"Kardiyoloji");

    public int id;
    public String text;

    Bolum(int id, String text){
        this.id=id;
        this.text=text;
    }


    public static Bolum getValue(String text){

        for(Bolum bolum: Bolum.values())
        {
            if(bolum.text.equals(text))
                return bolum;
        }

        return Bolum.COCUK_HASTALIKLARI;

    }

}
