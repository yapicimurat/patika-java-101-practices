package homework13;

import java.util.Scanner;

public class App {

    /*
       Ödev - Desene Göre Metot Oluşturma
        Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan
        döngü kullanmadan bir "Recursive" metot yazın.
    */
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int number = scanner.nextInt();
        int firstState = number;
        System.out.print(number + " ");

        number -= 5;
        boolean firstCaseCompleted = false;
        while(number !=  firstState){

            if(number >= 0 && !firstCaseCompleted){

                number -= 5;
            }else{
                firstCaseCompleted = true;
            }

            if(firstCaseCompleted){
                number += 5;
            }

            System.out.print(number + " ");
        }



    }

    private static void process(int number){

    }




}
