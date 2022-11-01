package practice28;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        System.out.println(Arrays.toString(list));

        for (int item : list){
            System.out.print(item);
            System.out.print(" , ");
        }

        Arrays.sort(list);

        System.out.print("\nSayi giriniz:  ");
        int nearNumber = scanner.nextInt();

        int minvalue = list[0];
        int maxvalue = list[0];

        for (int i : list){
            if (i < nearNumber){
                minvalue = i;
            }
            if (i > nearNumber){
                maxvalue = i;
                break;
            }
        }

        System.out.println("Girilen sayıya en yakın en küçük eleman:  " + minvalue);
        System.out.println("Girilen sayıya en yakın en büyük eleman:  " + maxvalue);



    }


}
