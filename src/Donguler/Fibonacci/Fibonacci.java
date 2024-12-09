package Donguler.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int fiboOne=0,fiboTwo=1,yeniSayi=0; // fibonaccinin ilk iki sayısını ve olusturulacak yeni sayıyı tanımlıyoruz.
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısı giriniz : ");
        int elemanSayisi = sc.nextInt();

        if(elemanSayisi<=0){
            System.out.print("0 ya da negatif sayı girdiniz. Pozitif sayı giriniz.");
        }else if (elemanSayisi==1) {
            System.out.println("Fibonacci serisi: 0");
        }else{
            System.out.print(elemanSayisi+" elemanlı fibonacci serisi: "+fiboOne+ ","+fiboTwo);
        }



        for(int i= 3; i <= elemanSayisi;i++){
            yeniSayi=fiboOne+fiboTwo;   // Fibonaccinin kuralı olan formülü uyguluyoruz.
            System.out.print(","+yeniSayi); //Formül uygulandıktan sonra çıktıya ekliyoruz.

            /* Burada her döngüden sonra bu kural işlenerek bir sonraki döngüye devam edecektir.
               böylelikle fibonacci kuralındaki toplama işlemi her döngüde işlenmiş olacaktır.*/
            fiboOne=fiboTwo;
            fiboTwo=yeniSayi;

        }


    }
}
