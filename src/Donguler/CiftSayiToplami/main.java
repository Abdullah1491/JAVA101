package Donguler.CiftSayiToplami;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int sayi,toplam=0,sayiAdedi=0;
        double ortalama=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi=sc.nextInt();


        for (int i = 1; i <= sayi; i++){
            if (i %3 ==0 && i %4 == 0){   // 3e ve 4'e bölünebilen sayıları buluyoruz.
                toplam+=i;   // her döngüde bölünebilen sayıları toplama ekliyor.
                sayiAdedi++;   /*kullanıcının vermiş olduğu sayıya kadar olanların
                                hem 3 hemde 4 bölünenlerin kaç adet olduğunu sayıyoruz*/

                ortalama=toplam/sayiAdedi; // ortalama hesaplama formülü
            }

        }
        System.out.println("3'e ve 4'e bölünebilen sayıların toplamının ortalaması: "+ ortalama);
    }
}

