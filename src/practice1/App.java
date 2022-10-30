package practice1;

import java.util.Scanner;

public class App {

    /*

    */

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        double matematik = 0;
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = scanner.nextDouble();

        double fizik = 0;
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scanner.nextDouble();

        double kimya = 0;
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scanner.nextDouble();

        double turkce = 0;
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextDouble();

        double tarih = 0;
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = scanner.nextDouble();

        double muzik = 0;
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = scanner.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        String sonucMesaji = (ortalama >= 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama : " + ortalama + " " + sonucMesaji);

    }
}
