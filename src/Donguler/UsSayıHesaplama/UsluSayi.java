package Donguler.UsSayıHesaplama;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        int n,number;

        /* Üslü sayı formülü örnek 3^4 = 3*3*3*3
        number = sayının ta kendisi örneğe göre = 3
        n= üs olacak sayı örneğe göre = 4
        özet olarak number sayısı n kadar adet ile çarpacağız.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        number= sc.nextInt();
        System.out.print("Üs olmasını istediğiniz sayıyı giriniz: ");
        n=sc.nextInt();

        int sonuc = 1;

        for(int i=1; i<= n; i++){
            sonuc *= number;
        }
        System.out.println(number+" üzeri " +n+" = " +sonuc);
    }
}
