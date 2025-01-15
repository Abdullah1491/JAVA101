package Metodlar.PrimeNumber;
import  java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the any number: ");
        int primeNo = sc.nextByte();

        if(primeNo <= 1){
            System.out.print(primeNo + " is not a prime number.");
        }else{
            if(isPrime(primeNo , 2)){
                System.out.print(primeNo + " is a prime number.");
            }else{
                System.out.print(primeNo+ " is not a prime number.");
            }
        }
    }

    static boolean isPrime(int primeNo, int divisor){
        if(divisor==primeNo / 2+1 ){  // Base case = Temel Durum
            return true;
        }
        if(primeNo%divisor == 0){    // Kullanıcının girdiği tam bölünebiliyorsa sayı asal değildir.
            return false;
        }
        return isPrime(primeNo,divisor+1);
    }
}
/*Base case: Resursive metodlarda bir sayının asal olup olmadığını bulmak için o sayının yarısına kadar bölme yaparız.
Örnek: 15 sayısının yarısı 7,5 tur. Yani 7 e kadar olan kısmı işlem yaparsak sayının zaten asal olup olmadığını anlarız.
 */