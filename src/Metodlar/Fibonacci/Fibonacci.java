package Metodlar.Fibonacci;
import java.util.Scanner;

public class Fibonacci {
    static int fib ( int n) {
        if (n == 1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = sc.nextInt();

        System.out.println(n+". sıradaki fibonacci terimi " + fib(n));

    }
}
