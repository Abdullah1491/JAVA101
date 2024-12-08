package Donguler.AsalSayi;

public class Asal {
    public static void main(String[] args) {

        // 2'den 100'e kadar her sayıyı kontrol ediyoruz.
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;  // Başlangıçta sayıyı asal kabul ediyoruz.

            // Sayıyı asal olup olmadığını kontrol ediyoruz.
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {  // Eğer sayi, i'ye bölünüyorsa, asal değil.
                    asalMi = false;
                    break;  // Bölen bulundu, daha fazla kontrol etmeye gerek yok.
                }
            }

            // Eğer sayıyı bölen bulunmadıysa, sayıyı asal kabul ederiz.
            if (asalMi) {
                System.out.print(sayi + " ");  // Asal sayıyı yazdırıyoruz.
            }
        }
    }
}