package TemelKavramlar.KdvTutariHesaplama;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        // Değişkenlerimizi oluşturuyoruz.
        double tutar, kdvOran=0.18, kdvTutar, kdvliFiyat;


        //Scanner değişkenimizi oluşturuyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ücret tutarını yazınız:" );
        tutar= input.nextDouble();

        // Burada kdv oranı ile ilgili şart bloğu oluşturuyoruz.
        kdvOran=(tutar >= 0 && tutar< 1000 )? 0.18 : 0.08;
        kdvTutar = tutar * kdvOran;
        kdvliFiyat = tutar + kdvTutar;

        System.out.println("KDV'siz Fiyat:" + tutar);
        System.out.println("KDV'li Fiyat:"+ kdvliFiyat);
        System.out.println("KDV Tutarı:"+ kdvTutar);

    }
}
