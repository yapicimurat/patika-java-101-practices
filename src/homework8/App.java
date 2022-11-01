package homework8;

import java.util.Scanner;

public class App {

    /*
        Ödev - Ters Üçgen Yapımı
        - Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
    */

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz: ");
        int level = scanner.nextInt();


        for(int i = 1; i <= level; i++){


            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= level * 2 - i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
