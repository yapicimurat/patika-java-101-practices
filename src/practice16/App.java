package practice16;

import java.util.Scanner;

public class App {

    //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int base, pow;

        System.out.println("Taban giriniz: ");
        base = scanner.nextInt();

        System.out.println("Kuvvet giriniz: ");
        pow = scanner.nextInt();

        int result = 1;

        for(int i = 1; i <= pow; i++){
            result *= base;
        }

        System.out.println(base + " sayısının " + pow + ". kuvveti: " + result);

    }
}
