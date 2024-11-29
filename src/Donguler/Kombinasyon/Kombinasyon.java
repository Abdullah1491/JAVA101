package Donguler.Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        // n! = 1*2*3*4 ...n. Faktoriyel hesaplama.
        // Kombinasyon Formülü : C(n,r) = n! / (r! * (n-r)!)

        /* NOT:
        While döngüsünü kullanmamın sebebi daha çok alışmak içindir.
        For döngüsüyle bu kod daha kısa olacaktır.
         */

        int n,r;
        int nFaktoriyel=1,rFaktoriyel=1,nEksiR=1;


        Scanner sc = new Scanner(System.in);
        System.out.print("Kümede kaç adet eleman olduğunu yazınız:");
        n = sc.nextInt();
        System.out.print("Bu kümeden seçilecek eleman sayısını yazınız:");
        r =sc.nextInt();


        // Önce n kümesinin faktoryelini hesaplıyorum.
        int i=1;
        while (i<=n){
            nFaktoriyel*= i;
            i++;
        }

        // Şimdi r seçilecek eleman sayısının faktoryelini hesaplıyorum
        i=1;
        while (i<=r){
            rFaktoriyel *= i;
            i++;
        }

        //n-r matematiksel hesaplamanın faktoryelini hesaplıyorum.Değişken adına "nEksiR" adını vermiştim.
        i=1;
        while(i<= n-r) {
            nEksiR *= i;
            i++;

        }
        //Kombinasyon için değişken oluşturdum ve tanımladım.
        int c = nFaktoriyel / ( rFaktoriyel * nEksiR );
        System.out.println("KombinasyonC(" + n +"," + r+ ")=" + c);


    }

}
