package practice1;

import java.util.Scanner;

public class App {

    /*

    */

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        double math = 0;
        System.out.println("Matematik notunuzu giriniz: ");
        math = scanner.nextDouble();

        double physic = 0;
        System.out.println("Fizik notunuzu giriniz: ");
        physic = scanner.nextDouble();

        double chemical = 0;
        System.out.println("Kimya notunuzu giriniz: ");
        chemical = scanner.nextDouble();

        double turkish = 0;
        System.out.println("Türkçe notunuzu giriniz: ");
        turkish = scanner.nextDouble();

        double history = 0;
        System.out.println("Tarih notunuzu giriniz: ");
        history = scanner.nextDouble();

        double music = 0;
        System.out.println("Müzik notunuzu giriniz: ");
        music = scanner.nextDouble();

        double avarage = (math + physic + chemical + turkish + history + music) / 6;
        String resultMessage = (avarage >= 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama : " + avarage + " " + resultMessage);

    }
}
