package practice5;

import java.util.Scanner;

public class App {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        double r = scanner.nextDouble();
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        double a = scanner.nextDouble();

        double area = (Math.PI * (Math.pow(r, 2) * a)) / 360;

        System.out.println("Dairenin alanı: " + area);


    }
}
