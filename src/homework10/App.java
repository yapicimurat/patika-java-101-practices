package homework10;

import java.util.Scanner;

public class App {

    /*
        Ödev - Fibonacci Serisi
        - Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Fibonacci Serisi Nedir ?
            Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın
        orana gittikçe yaklaşan bir dizi elde edilir.

            Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
        Fibonacci dizisinin ilk on sayısı şu şekildedir:

    */

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n1 = 0, n2 = 1, sum = 0, limit;

        System.out.println("Kaç elemanlı fibonacci listelemek istersiniz?: ");
        limit = scanner.nextInt();

        for(int i = 1; i <= limit; i++){

            sum = n1 + n2;

            System.out.println(n1 + " + " + n2 + " = " + (sum));
            n1 = n2;
            n2 = sum;

        }


    }
}
