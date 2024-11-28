package KosulluIfadeler.HesapMakinesi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Kullanıcıdan alacağımız veriler için değişken oluşturduk.
        int num1,num2,select;

        //Oluşturduğumuz bu değişken içinde bir scanner sınıfı oluşturduk.
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen ilk numarayı giriniz: ");
        num1=sc.nextInt();
        System.out.print("Lütfen ikinci numarayı giriniz: ");
        num2=sc.nextInt();

        //Ayrıca kullanıcının seçim yapabilmesi için yine bir değişken oluşturuyoruz.

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen hangi işlemi yapmak istediğinizi seçiniz: ");
        select= sc.nextInt();


        switch (select){
            case 1: System.out.print("Sonuç: "+ (num1+num2));
            break;
            case 2: System.out.print("Sonuç:"+ (num1-num2));
            break;
            case 3: System.out.print("Sonuç:"+ (num1*num2));
            break;
            case 4:
                if (num2==0){
                    System.out.print("Bölme işlemi hatalı: Sıfıra bölünemez.");
                }else {
                    System.out.print("Sonuç: " + (num1 / num2));
                }
            break;
            default:
                System.out.print("Hatalı giriş yaptınız. Tekrar deneyiniz.");



        }
    }
}









