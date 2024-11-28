package TemelKavramlar.NotOrtalamasiHesaplama;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        // Değişkenleri oluşturuyorum.
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfını tanımlıyoruz.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.println("Matematik notunuzu giriniz: ");
        mat =inp.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih =inp.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        //Kullanıcıdan aldığımız değerlerin toplamını alarak, yeni bir değişken daha oluşturuyoruz.
        int Toplam = (mat + kimya + fizik + muzik + turkce + tarih);
        int ToplamOrt = Toplam/6;

        //Kullanıcının durumu için oluşturduğumuz koşullu (Ternary) kod yapısı oluşturduk.
        String sonuc=(ToplamOrt>=60)?"Sınıfı Geçti.":"Sınıfta Kaldı.";
        System.out.println(sonuc);

    }
}
