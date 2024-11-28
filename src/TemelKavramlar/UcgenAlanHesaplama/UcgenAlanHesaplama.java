package UcgenAlanHesaplama;

import java.util.Scanner;


public class UcgenAlanHesaplama {
    public static void main(String[] args) {

        //Kullanıcıdan aldığımız veri ile scanner değişkenini oluşturuyoruz.

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen 1.kenarı giriniz: ");
        double Kisakenar1=input.nextInt();
        System.out.print("Lütfen 2.kenarı giriniz: ");
        double Kisakenar2=input.nextInt();
        System.out.print("Lütfen uzun kenarını giriniz: ");
        double Uzunkenar= input.nextInt();

        /*Burada aşağıdaki formüllere göre değişkenleri tanımlıyoruz
        Üçgenin çevresi = 2𝑢
        𝑢 = (a+b+c) / 2 (çevrenin yarısı)
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */


        double u=(Kisakenar1+Kisakenar2+Uzunkenar)/2;
        double ucgenCevre=2*u;
        double Alan= Math.sqrt(u*(u-Kisakenar1)*(u-Kisakenar2)*(u-Uzunkenar));

        System.out.print("Üçgenin alanı: "+ Alan);
    }
}
