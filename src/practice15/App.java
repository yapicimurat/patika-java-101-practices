package practice15;

import java.util.Scanner;

public class App {

    /*
        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
    */

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int n, r;
        System.out.println("n değerini giriniz: ");
        n = scanner.nextInt();

        System.out.println("r değerini giriniz: ");
        r = scanner.nextInt();

        double result = (fact(n)) / (fact(r) * fact(n - r));


        System.out.println("n'nin r'li kombinasyonu: " + result);


    }

    //calc. fact.
    private static int fact(int limit){
        int result = 1;
        for(int i = 1;i <= limit; i++){
            result *= i;
        }
        return result;
    }

}
