package homework15;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    /*
       Ödev - Dizideki Elemanların Frekansı
       Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
    */
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[] {11, 11, 33, 54, 54,  11, 112, 55, 33};

        for(int i = 0; i < numbers.length; i++){
            int counter = 1;
            for(int j = i + 1; j < numbers.length - 1; j++){

                //if number has own repeat, increate counter one by one
                if(numbers[i] == numbers[j]){
                    counter++;
                }
            }
            System.out.println(numbers[i] + " sayısı " + counter + " kere tekrar edildi.");
        }


    }

}
