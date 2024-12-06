package Donguler.MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz(x): ");
        int x=sc.nextInt();
        int total=0;

        for(int i = 1; i <= x -1; i++){   // burada x-1 yapmamızın sebebi kendisi hariç dediğinden dolayı x i bir düşürdük.
            if(x % i == 0){
                total+=i;
            }

        }
        if(total==x){
            System.out.println(x+" mükemmel sayıdır.");
        }else{
            System.out.println(x+ " mükemmel sayı değildir.");

        }

    }

}
