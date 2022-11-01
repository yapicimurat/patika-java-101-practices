package homework12;

import java.util.Scanner;

public class App {

    /*
       Ödev - Asal Sayı Bulan Program
        Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
    */
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();

        if(isPrimeNumber(number, 2)){
            System.out.println(number + " sayısı ASALDIR!");
        }else{
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }

    private static boolean isPrimeNumber(int n, int i){

        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrimeNumber(n, i + 1);
    }



}
