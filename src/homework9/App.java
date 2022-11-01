package homework9;

import java.util.Scanner;

public class App {

    /*
        Ödev - Ters Üçgen Yapımı
        - Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
    */

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        for(int i = 2; i <= 100; i++){

            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }

        }

    }

    //check if the given number is prime or not...
    private static boolean isPrimeNumber(int number){
        boolean result = true;

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }

        return result;
    }
}
