package TemelKavramlar.ManavKasa;

import  java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        // Öncelikli olarak değişkenlerimizi oluşturuyoruz.
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11 ,muzFiyat=0.95 ,patlicanFiyat=5.00;


        // Kullanıcıdan ürün miktarlarını almak için Scanner sınıfını kullanıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kilo miktarını giriniz?: ");
        double armutKg=inp.nextDouble();

        System.out.print("Elma kilo miktarını giriniz?: ");
        double elmaKg=inp.nextDouble();

        System.out.print("Domates kilo miktarını giriniz?: ");
        double domatesKg= inp.nextDouble();

        System.out.print("Muz kilo miktarını giriniz?: ");
        double muzKg=inp.nextDouble();

        System.out.print("Patlıcan kilo miktarını giriniz?: ");
        double patlicanKg=inp.nextDouble();


        // Toplam tutarı hesaplaması için değişkenimizi oluşturuyoruz.
        double toplamTutar=(armutFiyat*armutKg)+(elmaFiyat*elmaKg)+(domatesFiyat*domatesKg)+(muzFiyat*muzKg)+(patlicanFiyat*patlicanKg);

        System.out.println("Toplam tutarınız: "+ toplamTutar + " TL");

    }
}


