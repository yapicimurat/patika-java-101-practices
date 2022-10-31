package homework3;

import java.util.Scanner;

public class App {

    /*
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
    */

    private static final Double PRICE_PER_KM = 0.10;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double totallyPrice = 0;

        System.out.println("Mesafe(KM) giriniz: ");
        double distanceAsKM = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Yolculuk tipiniz giriniz: ");
        int type = scanner.nextInt();

        double discountRatio = 0;

        if(distanceAsKM <= 0 || age <= 0 || (type != 1 && type != 2)){
            System.out.println("Hatalı veri girdiniz!");
        }else{

            if(age < 12){
                discountRatio = 0.5;
            }
            else if(age >= 12 && age <= 24){
                discountRatio = 0.1;
            }
            else if(age >= 65){
                discountRatio = 0.3;
            }

            totallyPrice = distanceAsKM * PRICE_PER_KM;


            if(type == 2){
                discountRatio += 0.2;
                totallyPrice = totallyPrice * 2 * discountRatio;
            }else{
                totallyPrice = totallyPrice * discountRatio;
            }


            System.out.println("Toplam Tutar: " + totallyPrice);
        }


    }



}
