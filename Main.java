
/*

Inheritance  -> Kalıtım -> Miras

IS-A ilişkisi. ( Inheritance vardır demek. İngilizcedeki is a.. gibi düsün :) ( Doctor is a worker gibi..) Doktorda işçiden gelmektedir gibi düşünelim.
 */
public class Main {

    public static  void main ( String [] args) {

        Yonetici yonetici1= new Yonetici("Eda",2500,"IT",10);
        yonetici1.bilgileriGoster();   //yonetici class ı calisan sınıfından kalıtım aldıgı icin superclass( calisan) daki fonksiyonu kullanabiliyor..
        yonetici1.zam_yap(500);



    }
}
