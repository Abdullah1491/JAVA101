package Donguler.HarmonikSayi;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);
        System.out.print(" n: sayısını giriniz: ");
        int n = inp.nextInt();

        double sonuc = 0;          // harmonik sayının formülünden dolayı sonu ondalıklı olacagından double olusturduk.

        for(double i=1; i <= n; i++){    // i'yi da double vermemizin nedeni formülden dolayı .
            sonuc += (1/i) ;

        }
        System.out.println("n'nin harmonik sayı sonucu : "+ sonuc);
    }
}
