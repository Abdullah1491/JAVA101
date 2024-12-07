package Donguler.TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n= sc.nextInt();


        for (int i = n; i >= 1; i--) {
            for (int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();   // Burası döngü bitince yeni bir satıra geçmek için boş print edilmiştir.
        }


    }
}
