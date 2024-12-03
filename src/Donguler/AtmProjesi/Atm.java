package Donguler.AtmProjesi;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        String KullaniciAdi, Sifre, tekrarSor;
        int secim;
        int bakiye = 2000, girilenPara = 0, cekilenPara = 0;

        Scanner sc = new Scanner(System.in);

        int KalanHak = 3;
        while (KalanHak > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            KullaniciAdi = sc.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            Sifre = sc.nextLine();

            if (KullaniciAdi.equals("Abdullah") && Sifre.equals("123")) {
                System.out.println("Merhaba. Code Banka hoşgeldiniz.");

                // do-while döngüsünün düzgün konumlandırılması
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-)Para Yatırma\n" +
                            "2-)Para Çekme\n" +
                            "3-)Bakiye Sorgulama\n" +
                            "4-)Çıkış Yap.");
                    secim = sc.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.println("Girmek istediğiniz miktarı yazınız: ");
                            girilenPara = sc.nextInt();
                            bakiye += girilenPara;
                            break; // 1. koşul sona erer.

                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı yazınız: ");
                            cekilenPara = sc.nextInt();

                            if (cekilenPara > bakiye) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                bakiye -= cekilenPara;
                            }
                            break; // 2. koşul sona erer.

                        case 3:
                            System.out.println("Şuanda hesabınızda bulunan bakiye miktarı: " + bakiye);
                            break; // 3. koşul sona erer.

                        case 4:
                            System.out.println("Tekrar görüşmek üzere. İyi günler dileriz.");
                            break; // 4. koşul sona erer.

                        default:
                            System.out.println("Geçersiz işlem. Tekrar deneyiniz.");
                            break; // geçersiz işlem koşulu sona erer.
                    }

                    // Kullanıcıdan tekrar bir işlem yapıp yapmayacağını soruyorum
                    if (secim != 4) {
                        System.out.println("Başka bir işlem yapmak istiyor musunuz? (Evet/Hayır)");
                        tekrarSor = sc.next();

                        // Kullanıcının cevabına göre hareket ediyoruz, equalsIgnoreCase kullanıyoruz
                        if (tekrarSor.equalsIgnoreCase("Hayır")) {
                            System.out.println("Tekrar görüşmek üzere. İyi günler dileriz.");
                            break; // Ana döngü sona erer.
                        }

                    }
                } while (secim != 4); // Ana döngü sonlanmadan devam eder.

            } else {
                --KalanHak;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz.");
                if (KalanHak == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankamız ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: " + KalanHak);
                }
            }
        }
    }
}
