package homework5;

import java.util.Scanner;

public class App {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl giriniz: ");
        int year = scanner.nextInt();

        if(year % 100 != 0){

            if(year % 4 == 0){
                System.out.println(year + " bir artık yıldır !");
            }else{
                System.out.println(year + " bir artık yıl değildir !");
            }

        }else{
            if(year % 400 == 0){
                System.out.println(year + " bir artık yıldır !");
            }else{
                System.out.println(year + " bir artık yıl değildir !");
            }
        }


    }
}
