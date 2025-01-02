package Metodlar.Palindrom;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alıyoruz.
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int num = sc.nextInt();

        // Kullanıcıdan almış olduğumuz sayının palindrom olup olmadığını bildirdiğimiz metod.
        if (isPalindrom(num)) {      // İşlemi isPalindrome fonksiyonu ile kullanıyoruz.
            System.out.println(num + " bir palindrom sayıdır.");
        } else {
            System.out.println(num + " palindrom bir sayı değildir.");
        }
    }

    // Bir metod oluşturduk isPalindrome adında.
    static boolean isPalindrom(int num) {
        int temp = num, reversedNum = 0, lastNum; // temp ile geçici değişken oluşturduk.

        while (temp != 0) {
            lastNum = temp % 10;
            reversedNum = (reversedNum * 10) + lastNum;
            temp /= 10;
        }
        return num == reversedNum;
    }
}
