/*

Calisan Sınıfı Ana Sınıf (SuperClass veya BaseClass denir) olarak oluştur.

-> Özelliklerini oluştur.
->Calisan Constructor olusturalım
-> calis , bilgileriGoster , departman_degistir  3 fonksiyon yaz.
-





Daha sonra Yonetici Class'ı  Calisan Class'ından özellikleri ve metodları miras\kalıtım almasını sağlayacagız.

 */


public class Calisan {  //  AnaSınıfımız yani -> SuperClass veya BaseClass

    private String isim;
    private int maas;
    private String departman;

    public Calisan ( String isim,int maas,String departman) {

        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis () {

        System.out.println("Calısan Çalışıyor..");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void bilgileriGoster () {

        System.out.println("İsim: " + isim);
        System.out.println("Maaş: " + maas);
        System.out.println("Departman: " + departman);
    }

    public void departman_degistir (String yeniDepartman) {

        System.out.println("Departman Değiştiriliyor..");
        this.departman = departman;
        System.out.println("Yeni Departman:" +  this.departman);
    }


}
