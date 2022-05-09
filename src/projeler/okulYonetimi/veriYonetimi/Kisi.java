package projeler.okulYonetimi.veriYonetimi;

public class Kisi {

    String ad="Ad yok";
    String soyad="Soyad yok";
    String kimlikNo="TCKN yok";
    String yas="Yas yok";

    public Kisi() {
    }

    public Kisi(String ad, String soyad, String kimlikNo, String yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
}
