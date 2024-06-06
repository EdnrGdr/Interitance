
public class Yonetici extends Calisan {   // Yonetici->Altsınıf->SubClass .  -  extends Calisan dedigimizde Calisan sınıfının özellik ve metodlarını miras alırız.


    private int sorumlu_kisi;  // Ekstra özellik eklemyebiliyoruz. Özelliği yaz. Asagıda constructor dada this olarak ekle. Main sınıfındada ekstra özelliği ekle.

    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {      // bu constructor ı cagırmadan Calisan sınıfındaki özelliklere ulasamayız. Özellikler Private cünkü :)
        super(isim, maas, departman);

        this.sorumlu_kisi=sorumlu_kisi;
    }
    public void zam_yap ( int zammiktari) {           // Ekstra metod ekleme.

        System.out.println("Çalışanlara " + zammiktari + " TL zam yapıldı..");


    }

    public void bilgileriGoster () {  // OVERRIDING -  kalıtım aldıgın sınıfta(Calisan)  bulunan bir metodun aynı ismi ile yeni metod yazarak ( Overriding) superClasstaki (Calisan) metodu iptal edersin. Yeni yazdıgın metod geçerli olur..
        // Not bunu yapabilmek icin superClassta getter-setter metodlarını yapmayoı unutma!!
        System.out.println("İsim: " + getIsim());
        System.out.println("Maaş: " + getMaas());
        System.out.println("Departman: " + getDepartman());
        System.out.println("Sorumlu Oldugu Kisi Sayisi:" + this.sorumlu_kisi);

        /*

        Bu islemi baska sekildede yapabiliriz. Calisan ( SuperClass) taki metodu kullanıp o metoda ekstra bir özelliği ekleyebiliriz.. şu şekilde;
        Miras aldıgım metodu kullanarak kendi metodumuzu override edeceğiz yani;

        super.bilgileriGoster();
        System.out.println("Sorumlu Oldugu Kisi Sayisi:" + this.sorumlu_kisi);

         */

    }
}
