package practice14;

import java.util.Scanner;

public class App {
    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int limit = scanner.nextInt();

        for(int i = 1; i <= limit; i++){

            if((i % 4 == 0 && i / 4 == 4) || (i % 5 == 0 && i / 5 == 5)){
                System.out.println(i);
            }

        }


    }
}
