package practice17;

import java.util.Scanner;

public class App {

    //Ödev
    //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
    //
    //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        String numberAsString = scanner.next();

        int sum = 0;

        for(int i = 0; i < numberAsString.length(); i++){
            sum += Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
        }

        System.out.println("Girilen " + numberAsString + " sayısının rakamlarının toplamı: " + sum);


    }
}
