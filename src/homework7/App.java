package homework7;

import java.util.Scanner;

public class App {

    //Ödev - Mükemmel Sayı Bulan Program
    /*
    Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
     değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
    */

    /*
    Mükemmel Sayı Nedir ?
    - Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
    */
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();


        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0)
                sum += i;
        }

        if(sum == number){
            System.out.println("Girilen sayı bir mükemmel sayıdır!");
        }else{
            System.out.println("Girilen sayı mükemmel sayı değildir!");
        }


    }
}
