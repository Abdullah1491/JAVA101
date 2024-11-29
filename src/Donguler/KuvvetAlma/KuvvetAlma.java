package Donguler.KuvvetAlma;

import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {

        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=sc.nextInt();

        int i=1;                           // i 'yi tanımlıyorum. Sayımın başlangıcın 1 olduğunu söylüyorum.

        System.out.println("4'ün kuvvetleri: ");     /* Döngü içine yazarsam sürekli bunu her rakamda yazacaktı.
                                                        Onun için bunu başlıkmış gibi düşünerek döngü dışında yazdım*/

        while(i<=k){
         /* Eğer i'yi formülün altında yazmış olsaydık çıktı bize fazladan bir döngü çalıştırarak i<=k kuralını bozdururdu.
         Çünkü o zaman önce formül çalışıp sonra i yazdıracaktı.*/

            System.out.println(i);

            i *= 4;     // 4'ün kuvvetini hesaplayan formül.

        }

        i=1;

        System.out.println("5'in kuvvetleri: ");

        while (i<=k){
            System.out.println(i);
            i *= 5;

        }
    }

}
