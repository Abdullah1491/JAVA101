package Metodlar.AdvancedCalculator;

import java.util.Scanner;

public class AdvancedCal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);

        while(true){
            System.out.print("Please select an operation :");
            select = scan.nextInt();
            if (select==0){
                break;
            }

            int a = 0, b = 0;
            if (select != 6) {       // Burası faktoriyel hesaplamasında sorulmaması için koyduğumu kural.
                System.out.print("First number: ");
                a = scan.nextByte();
                System.out.print("Second number: ");
                b = scan.nextByte();
            }
            switch (select) {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    System.out.print("Please enter a number to calculate its factorial: ");
                    int n = scan.nextInt();
                    factorial(n);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    rectanglePerimeter(a,b);
                case 0:
                    break;
                default:
                    System.out.println("You have entered an incorrect value, try again.");

            }
        }
    }

    static int sum(int a, int b) {
        int result= a + b;
        System.out.println("Result is " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Result is " + result);
        return result;
    }

    static int times(int a, int b) {
        int result =  a * b ;
        System.out.println("Result is " + result);
        return result;
    }

    static int divided(int a, int b) {
        if(b == 0 ){
            System.out.println("Any number cannot divided by zero!");
            return 0;
        }
        int result = a / b ;
        System.out.println("Result is " + result);
        return  result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i=1; i <= b; i++){
            result *= a;
        }
        System.out.println("Result is " + result);
        return result;
    }

    static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("Result is " + result);
        return result;

    }

    static int mod(int a, int b){
        int result= a % b;
        System.out.println("Result is " + result);
        return result;
    }
    static void rectanglePerimeter(int a, int b){
        System.out.println("Perimeter of a rectangel "+ (2* (a+b)));
        System.out.println("Area of a rectangle " + (a*b));
    }
}

