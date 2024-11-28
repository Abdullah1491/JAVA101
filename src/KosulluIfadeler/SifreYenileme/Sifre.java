package KosulluIfadeler.SifreYenileme;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {

        String usarname,password;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        usarname=sc.nextLine();

        System.out.print("Lütfen şifrenizi giriniz: ");
        password=sc.nextLine();

        if(usarname.equals("patika")&& (password.equals("java123"))){
            System.out.println("Girişiniz gerçekleşti.");
        }else {
            System.out.println("Kullanıcı adı veya şifreniz hatalı.");

            System.out.println("Şifrenizi yenilemek ister misiniz? (Evet/Hayır): ");
            String answer = sc.nextLine();

            if (answer.equals("Evet")) {
                System.out.println("Lütfen yeni şifrenizi giriniz: ");
                String newpassword = sc.nextLine();

                if (newpassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }


            }else {
                System.out.println("Şifre oluşturulamadı.");
            }


        }

    }
}
