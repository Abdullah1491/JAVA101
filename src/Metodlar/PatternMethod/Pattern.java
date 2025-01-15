package Metodlar.PatternMethod;
import java.util.Scanner;


public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        recursiveMethod(number);
    }

    static int recursiveMethod(int number){
        System.out.print(number + " "); // Bu satırda, metot her çağrıldığında, mevcut number değeri ekrana yazdırılır.
        if(number<=0){          // Kuralımızı oluşturmus olduk O veya negatif olunca geri dönecek.
            return number;
        }
        int result = recursiveMethod(number-5); // metod kendisini yeniden cagırıyor ve 5 cıkarıyor.
        System.out.print((result + 5) + " "); // metod geri döndüğünde 5 ekleyerek ekrana yazdırıyor.
        return result + 5;
    }
}


