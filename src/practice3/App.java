package practice3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class App {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Kenar uzunluğu giriniz: ");
        double lengthOfEdge1 = scanner.nextDouble();

        System.out.print("2. Kenar uzunluğu giriniz: ");
        double lengthOfEdge2 = scanner.nextDouble();

        System.out.print("3. Kenar uzunluğu giriniz: ");
        double lengthOfEdge3 = scanner.nextDouble();

        double perimeter = lengthOfEdge1 + lengthOfEdge2 + lengthOfEdge3;

        double u = perimeter / 2;

        double area = Math.sqrt(u * (u - lengthOfEdge1) * (u - lengthOfEdge2) * (u - lengthOfEdge3));

        System.out.println("Üçgenin alanı: " + area);


    }
}
