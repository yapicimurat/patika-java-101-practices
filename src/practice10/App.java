package practice10;

import java.util.Scanner;

public class App {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double number1, number2, number3;

        System.out.println("1.sayıyı giriniz: ");
        number1 = scanner.nextDouble();

        System.out.println("2.sayıyı giriniz: ");
        number2 = scanner.nextDouble();

        System.out.println("3.sayıyı giriniz: ");
        number3 = scanner.nextDouble();

        if(number1 < number2 && number1 < number3){

            if(number2 < number3){
                System.out.println("Number1 < Number2 < Number3");
            }else{
                System.out.println("Number1 < Number3 < Number2");
            }

        }
        else if(number2 < number1 && number2 < number3){
            if(number1 < number3){
                System.out.println("Number2 < Number1 < Number3");
            }else{
                System.out.println("Number2 < Number3 < Number1");
            }
        }
        else if(number3 < number2 && number3 < number1){
            if(number2 < number1){
                System.out.println("Number3 < Number2 < Number1");
            }else{
                System.out.println("Number3 < Number1 < Number2");
            }
        }


    }
}
