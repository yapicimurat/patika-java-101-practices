package homework14;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    /*
       Ödev - Dizideki Elemanları Sıralama
       Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
    */
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz: ");
        int lengthOfArr = scanner.nextInt();

        int arr[] = new int[lengthOfArr];

        for (int i = 1; i <= lengthOfArr; i++){
            System.out.println(i + ". sayıyı giriniz: ");
            arr[i - 1] = scanner.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(arr));

    }

    //To sort, I used to Bubble Sort Algorithm...
    private static void bubbleSort(int arr[]){
        for (int i = 0;i < arr.length - 1; ++i){
            for(int j = 0; j < arr.length - i - 1; ++j){
                if(arr[j + 1] < arr[j]){
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

}
