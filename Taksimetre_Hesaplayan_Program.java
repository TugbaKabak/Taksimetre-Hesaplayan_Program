import java.util.Scanner;

public class Taksimetre_Hesaplayan_Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int km;
        double kmHesabi, baslangicFiyati=10, kmTutari=2.20;

        System.out.println("Lütfen hesaplanmak istenilen mesafeyi KM cinsinden giriniz: ");
        km= input.nextInt();

        kmHesabi = baslangicFiyati + (km*kmTutari);

        if(kmHesabi<=20)
        {
            System.out.println("Kısa mesafe hesaplanmıştır. Minimum ödenmesi gereken tutar 20 TL'dir.");
            kmHesabi=20;
        }

        System.out.println("Taksimetre tutarı: "+ kmHesabi);
    }
}
