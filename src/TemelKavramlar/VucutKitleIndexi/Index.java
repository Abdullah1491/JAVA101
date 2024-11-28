package TemelKavramlar.VucutKitleIndexi;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden ) giriniz: ");
        double boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo=inp.nextDouble();

        /* Vücut kitle indexi için formülümüz aşşağıdaki gibidir.
        FORMÜL: Kilo (kg) / Boy(m) * Boy(m) */

        double vücutIndex= kilo/(boy*boy);

        System.out.println("Vücut kitle indexiniz: "+ vücutIndex);

    }
}
