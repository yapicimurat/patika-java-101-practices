package practice32;

import java.util.Scanner;

public class App {

    //Palindromik Kelimleri Bulan Program


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz ");
        String keyword = scanner.next();

        if(isPalindromicNumber(keyword)){
            System.out.println("Girilen kelime bir Palindromik kelimedir.");
        }else{
            System.out.println("Girilen kelime Palindromik kelime değildir!");
        }

    }

    private static boolean isPalindromicNumber(String keyword){
        boolean isPalindrome = true;

        double calcIterationCount;
        if(keyword.length() % 2 == 0){
            //even
            calcIterationCount = keyword.length() / 2;
        }else{
            //odd
            calcIterationCount = Math.floor(keyword.length() / 2);
        }

        for(int i = 0; i < calcIterationCount; i++){
            if(keyword.charAt(i) != keyword.charAt(keyword.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

}
