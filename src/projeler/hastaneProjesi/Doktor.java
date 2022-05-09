package projeler.hastaneProjesi;

public class Doktor {
    private String isim;
    private String soyIsim;
    private String unvan;
    Doktor doktor= new Doktor();

    public Doktor() {
    }

    public Doktor(String isim, String soyIsim, String unvan) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.unvan = unvan;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
