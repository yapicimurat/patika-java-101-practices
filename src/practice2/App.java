package practice2;

import java.util.Scanner;

public class App {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ücret giriniz: ");
        double price = scanner.nextDouble();

        double VAT = (price <= 1000) ? 0.18 : 0.8;

        double priceWithVAT = price * VAT + price;
        double priceVAT = price * VAT;


        System.out.println("Uygulanacak KDV: " + VAT);
        System.out.println("KDV'li Fiyat: "+ priceWithVAT);
        System.out.println("KDV Tutarı: "+ priceVAT);



    }
}
