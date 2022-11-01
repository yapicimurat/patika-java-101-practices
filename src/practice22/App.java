package practice22;

import java.util.Scanner;

public class App {


    //Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
    //Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    //
    //Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if(isPalindromicNumber(number)){
            System.out.println("Girilen sayı bir Palindromik sayıdır.");
        }else{
            System.out.println("Girilen sayı Palindromik değil!");
        }

    }

    private static boolean isPalindromicNumber(int number){
        boolean isPalindrome = true;

        double calcIterationCount;
        String convertString = String.valueOf(number);
        if(convertString.length() % 2 == 0){
            //even
            calcIterationCount = convertString.length() / 2;
        }else{
            //odd
            calcIterationCount = Math.floor(convertString.length() / 2);
        }

        for(int i = 0; i < calcIterationCount; i++){
            if(convertString.charAt(i) != convertString.charAt(convertString.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
