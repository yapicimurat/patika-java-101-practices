package homework4;

import java.util.Scanner;

public class App {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String zodiacs[] = new String[]{
                "Maymun", "Horoz",
                "Köpek", "Domuz",
                "Fare", "Öküz",
                "Kaplan", "Tavşan",
                "Ejderha", "Yılan",
                "At", "Yılan",
        };

        System.out.println("Doğum yılınızı giriniz: ");
        int birthYear = scanner.nextInt();

        int remainder = birthYear % 12;

        System.out.println(zodiacs[remainder]);


    }
}
