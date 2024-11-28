package TemelKavramlar.DaireAlaniHesaplama;

import java.util.Scanner;

public class DaireAlaniHesaplama {
    public static void main(String[] args) {

        //Öncelikli olarak kullanıcıdan yarıçap ve merkez açı bilgilerini alarak scanner sınıfı oluşturuyoruz.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçap(r) bilgisini giriniz: " );
        double r =input.nextDouble();

        System.out.print("Lütfen daire merkez açısı (a) giriniz: ");
        double a = input.nextDouble();

        // Pi değişkenini oluşturuyorum ya da tanımlıyorum.
        double pi =3.14;

        /* Formülümüz için değişkenler oluşturuyoruz.
        Formül : (𝜋 * (r*r) * 𝛼) / 360 */

        double daire_Alani_Dilimi = pi*(r*r)*a/360;

        System.out.println("Daire diliminin alanı: " + daire_Alani_Dilimi);

    }
}
