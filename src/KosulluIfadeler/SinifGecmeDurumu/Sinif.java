package KosulluIfadeler.SinifGecmeDurumu;

import java.util.Scanner;

public class Sinif {
    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,muzik,toplam=0,dersSayisi=0;

        Scanner sc =new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat=sc.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            dersSayisi++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=sc.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=sc.nextInt();
        if(fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=sc.nextInt();
        if(kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=sc.nextInt();
        if(muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }


        double ortalama=  (toplam / dersSayisi);


        if (ortalama>=55) {
            System.out.println("Sınıfı geçtiniz.Not ortalamanız:"+ ortalama);

        }else {
            System.out.println("Sınıfı geçemediniz. Not ortalamanız: "+ ortalama);
        }

    }
}
