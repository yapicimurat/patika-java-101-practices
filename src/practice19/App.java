package practice19;

import java.util.Scanner;

public class App {

    //Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int limit = 1;
        boolean reduce = false;
        for(int i = 1;i <= 9; i++){

            for(int j = 1; j <=  (9 - limit) / 2; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= limit; j++){

                System.out.print("*");
            }
            System.out.println();
            if(reduce == false)
                limit += 2;
            else
                limit -= 2;

            if(limit == 9)
                reduce = true;
        }




    }
}
