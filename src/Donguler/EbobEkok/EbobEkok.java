package Donguler.EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = sc.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2= sc.nextInt();

        int ebob= 1;

        int i = n1;
        while(i>=1){
            if(n1%i==0 && n2%i==0){
                ebob=i;
                break;
            }
            i--;
        }
        System.out.println("EBOB = "+ ebob);

        int k =1;
        while(k<=(n1 * n2)){
            if(k % n1 == 0 && k% n2 == 0){
            }
            k++;
        }
        int ekok=(n1*n2)/ebob;
        System.out.println("EKOK = "+ekok);
    }
}
