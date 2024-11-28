package KosulluIfadeler.ArtikYilHesaplama;

import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {

        int yil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        yil=sc.nextInt();

        if (yil%4 == 0 && (yil%100 != 0 || yil%400 == 0)){
            System.out.println(yil+ " bir artık yıldır.");
        }else {
            System.out.println(yil+ " artık bir yıl değildir. ");
        }

        // Ayrıca aşşağıdaki kod ternary operatörü ile de yapılan çıktı sonucudur.

        /*String sonuc = (yil % 4 == 0 && (yil % 100 != 0 || yil % 400 == 0))
             ? yil + "Artık bir yıldır"
             : yil + "artık bir yıl değildir";
        System.out.println(sonuc);*/
    }

}
