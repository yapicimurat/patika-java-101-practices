package practice13;


import java.util.Scanner;

public class App {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);


        int number = 0, sum = 0;


        while(number % 2 == 0){
            System.out.println("Sayı giriniz: ");
            number = scanner.nextInt();
            if(number % 4 == 0) {
                sum += number;
            }
        }

        System.out.println("Girilen 4'ün katı olan sayıların toplamı: " + sum);

    }
}
