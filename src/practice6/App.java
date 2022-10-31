package practice6;

import java.util.Scanner;

public class App {


    public static void main(String args[]){
        double number1, number2;
        int operationType = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        number1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");
        number2 = scanner.nextDouble();


        System.out.printf("1-Toplama\n2-Çıkarma\n3-)Çarpma\n4-Bölme\n");
        operationType = scanner.nextInt();

        double result = 0;

        try{
            switch(operationType){
                case 1:
                    result = number1 + number2;
                    break;

                case 2:
                    result = number1 - number2;
                    break;

                case 3:
                    result = number1 * number2;
                    break;

                case 4:
                    result = number1 / number2;
                    break;

                default:
                    System.out.println("Geçersiz işlem numarası girdiniz.");
                    break;
            }

            System.out.println("İşlemin sonucu: " + result);
        }
        catch(Exception exception){
            System.out.println("Bir hata meydana geldi. \n" + exception.getMessage());
        }

    }




}
