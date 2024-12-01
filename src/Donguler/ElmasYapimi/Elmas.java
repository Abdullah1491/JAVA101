package Donguler.ElmasYapimi;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {

        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Elmasınızın kaç satırdan olmasını istiyorsunuz.Lütfen sayınızı belirtiniz: ");
        sayi = inp.nextInt();


        // ELMASIN ÜST KISMI

        // Üst kısımda her satırda artan sayıda yıldız yazdırılır.

        int i = 1;
        while (i <= sayi) {

            // Boşlukları yazdırırken, yıldızlardan önce yerleştiriyoruz. Bu nedenle satır sonu eklenmiyor (println kullanılmıyor).
            int bosluk = 1;
            while (bosluk <= sayi - i) {
                System.out.print(" ");
                bosluk++;

            }

            // Bu döngü, boşlukları yazdırdıktan sonra, her satırda yıldız sayısını arttırarak yazdırır.
            int yildiz = 1;
            while (yildiz <= (2 * i) - 1) {
                System.out.print("*");
                yildiz++;
            }

            // Döngü buradan tekrar yukarıya 1 arttırarak çıkıp devam edecek ta ki "sayi" eşit oluncaya kadar.
            i++;
            System.out.println();

        }

        // ELMASIN ALT KISMI

        i = sayi - 1;
        while (i >= 1){

            int bosluk=1;
            while (bosluk <= sayi - i) {
                System.out.print(" ");
                bosluk++;
            }

            // Alt kısımda yıldız sayısı her satırda azalır ve döngü bu şekilde devam eder.
            int yildiz = 1;
                while ( yildiz <= (2*i) - 1){
                    System.out.print("*");
                    yildiz++;
                }

                // Döngü tekrardan yukarıya bu sefer azaltılarak çıkacak ta ki 1'e eşitlenene kadar.
                i--;
                System.out.println();

        }

    }
}
