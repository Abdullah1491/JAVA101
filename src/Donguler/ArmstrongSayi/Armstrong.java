package Donguler.ArmstrongSayi;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int sayi;
        Scanner sc =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi=sc.nextInt();
        int tempSayi=sayi;    // tempSayi değişkeni geçici bir değişken onuda kullanıcan alacağım sayı ile eşitliyorum.

        int basSayi=0;
        int basDeger=0;
        int basUs;
        int sonuc=0;

        // ilk olarak kullanıdan alacağım sayının kaç basamaklı olduğunu bulacağız.

        while(tempSayi!=0){      // burada 0 a kadar çalış diyoruz.
            tempSayi /= 10;
            basSayi++;
        }

        /*
        Yukarıdaki işlemden dolayı tempSayi farklı bir değere gelmişti.
        Şimdi yazacağım döngü ile sayi yine kullanıcının girmiş olduğu sayı ile eşitliyorum.
        */

        tempSayi=sayi;
        while (tempSayi != 0){               // 0'a kadar çalış diyoruz.
            basDeger = tempSayi % 10;        // Modül kullanmamızın sebebi kalanı ile işlem yapmak için.
            basUs = 1;
            for (int i =1; i<=basSayi; i++){       // burada artık üs işlemi döngüne başlıyoruz.
                basUs *= basDeger;
            }
            sonuc +=basUs;
            tempSayi /=10;
        }
        if(sonuc==sayi){
            System.out.println(sonuc+" bir armstrong sayısıdır.");
        }else{
            System.out.println(sonuc +" bir armstrong sayısı değildir.");
        }
    }
}
