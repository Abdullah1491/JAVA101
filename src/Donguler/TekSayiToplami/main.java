package Donguler.TekSayiToplami;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    int n;
    int toplam=0;

    Scanner inp = new Scanner(System.in);

    do {
        System.out.print("Lütfen bir sayı giriniz: ");     /* Biz kullanıcıdan döngü içinde sürekli sayı
                                                             isteyeceğimiz için buraya yazıyoruz.*/
        n= inp.nextInt();
        if ( n % 2== 0 && n % 4 == 0){          // çift ve 4'ün katı olan sayıları şartlıyoruz.
            toplam += n;

        }
    }while (n % 2== 0);                //Sayı çift ise döngüye devam et. Negatif dahi girse döngü devam eder.

        System.out.println(toplam);

    }
}
