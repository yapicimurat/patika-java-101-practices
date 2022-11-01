package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {


    /*
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
        ortalamasını hesaplayan programı yazınız.
    */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int limit = scanner.nextInt();

        int average = 0, sum = 0, count = 0;


        for(int i = 0; i <= limit; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }

        average = sum / count;
        System.out.println("Sayıların ortalaması: " + average);

    }
}
