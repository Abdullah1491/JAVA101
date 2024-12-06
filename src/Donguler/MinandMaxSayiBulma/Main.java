package Donguler.MinandMaxSayiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int N = scanner.nextInt();

        // Kullanıcıdan ilk sayıyı alıyoruz ve onu en büyük ve en küçük olarak kabul ediyoruz.
        System.out.print("1. Sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        int enBuyuk = sayi;
        int enKucuk = sayi;

        // i=2 olmasının sebebi ilk sayıyı kullanıcıdan aldık.Geri kalan 3 adet sorguyu döngü içinde yapıyoruz.
        for (int i = 2; i <= N; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");   // 2 sayıyı giriniz şeklinde olacak döngü N kadar devam edecek.
            sayi = scanner.nextInt();

            // En büyük sayıyı güncelleme
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            // En küçük sayıyı güncelleme
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
