package KosulluIfadeler.UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int yas, yolculukTipi;
        double mesafe;

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = sc.nextInt();
        System.out.print("Gidilecek mesafeyi km cinsinden yazınız: ");
        mesafe = sc.nextDouble();
        System.out.print("Yolculuk tipini belirtiniz? 1: Tek Yön, 2: Gidiş-Dönüş olarak giriniz: ");
        yolculukTipi = sc.nextInt();


        double normalTutar = mesafe * 0.10;
        double yasliIndirimi = normalTutar * 0.70;
        double gencIndirimi = normalTutar * 0.90;
        double cocukIndirimi = normalTutar * 0.50;
        double gidisDonusIndirimi = normalTutar * 2 * 0.80;


        if (yas > 0 && mesafe > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas <= 12) {
                if (yolculukTipi == 2) {
                    double gidisDonusTutar = cocukIndirimi * 2 * 0.80;
                    System.out.println("Bilet fiyatınız: " + gidisDonusTutar + " TL");
                } else {
                    System.out.println("Bilet fiyatınız: " + cocukIndirimi + " TL");
                }
            }
            else if (yas > 12 && yas <= 24) {
                if (yolculukTipi == 2) {
                    double gidisDonusTutar = gencIndirimi * 2 * 0.80;
                    System.out.println("Bilet fiyatınız: " + gidisDonusTutar + " TL");
                } else {
                    System.out.println("Bilet fiyatınız: " + gencIndirimi + " TL");
                }
            }
            else if (yas >= 65) {
                if (yolculukTipi == 2) {
                    double gidisDonusTutar = yasliIndirimi * 2 * 0.80;
                    System.out.println("Bilet fiyatınız: " + gidisDonusTutar + " TL");
                } else {
                    System.out.println("Bilet fiyatınız: " + yasliIndirimi + " TL");
                }
            }
            else {
                if (yolculukTipi == 2) {
                    double gidisDonusTutar = normalTutar * 2 * 0.80;
                    System.out.println("Bilet fiyatınız: " + gidisDonusTutar + " TL");
                } else {
                    System.out.println("Bilet fiyatınız: " + normalTutar + " TL");
                }
            }

        } else {
            System.out.println("Hatalı bilgi girdiniz.");
        }
    }
}
