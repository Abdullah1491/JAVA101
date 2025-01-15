package Metodlar.RecursiveExponentiation;
import java.util.Scanner;

public class exponentiation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextByte();

        System.out.print("Enter the power number: ");
        int power = sc.nextByte();

        int result=exponentNo(base,power);
        System.out.println("Result is " + result);
    }

    static int exponentNo (int base, int power) {

        if (power == 0) {
            return 1;
        }
        return base * exponentNo(base, power - 1);
    }
}



