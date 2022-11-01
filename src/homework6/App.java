package homework6;

import java.util.Scanner;

public class App {

    //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Kaç adet sayı gireceksiniz: ");
        int limit = scanner.nextInt();

        int smallest = 0, biggest = 0;
        for(int i = 1; i <= limit; i++){

            System.out.println(i + ". sayıyı giriniz: ");
            int number = scanner.nextInt();

            if(i == 1){
                smallest = number;
            }else{
                if(number < smallest)
                    smallest = number;
            }

            if(biggest < number)
                biggest = number;

        }

        System.out.println("Girilen sayılardan en küçüğü: " + smallest + ", en büyüğü: " + biggest);


    }
}
