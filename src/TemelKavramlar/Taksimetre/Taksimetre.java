package TemelKavramlar.Taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        //Kullanıcıdan veri almak için scanner sınıfını oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Km mesafesini giriniz: ");
        double km=scanner.nextDouble();

        // Değişkenleri oluştuyoruz veya tanımlıyoruz.
        double perKM = 2.20 , acilisUcreti=10, minimumUcret=20;

        double totalTutar=(perKM*km)+acilisUcreti;

        // Burada karar operatörünü kullanıyoruz.IDE bize math.max() metodunu gösteriyor. Daha sonra kullanacağız.
        totalTutar = (totalTutar < minimumUcret) ? minimumUcret : totalTutar;

        System.out.print("Toplam tutarınız: " + totalTutar);



    }
}
