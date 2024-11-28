package KosulluIfadeler.HavaDurumuEtkinlik;

import  java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int sicaklik;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bugün havanın sıcaklığı: ");
        sicaklik=sc.nextInt();

        String etkinlik = sicaklik < 5 ? "Kayak yapmanın tam zamanı." :
                sicaklik >= 5 && sicaklik <= 15 ?
                        sicaklik >=10 && sicaklik <=15 ?
                                "Aslında bu hava da sinemaya gidebilir ya da piknik yapabilirsiniz.":
                                "Neden bugün sinema'ya gitmeyesen ki?":
                        sicaklik >=10 && sicaklik <= 25 ? "Piknik yapmak için mükemmel bir hava.":
                                "Bu sıcaklıkta yüzmek en iyisi.";

        System.out.println(etkinlik);


    }

}
