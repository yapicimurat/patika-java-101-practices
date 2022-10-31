package practice8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {


    /*
    * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
    * */

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        List<Double> points = new ArrayList<Double>();

        double math = 0;
        System.out.println("Matematik notunuzu giriniz: ");
        math = scanner.nextDouble();
        points.add(math);

        double physic = 0;
        System.out.println("Fizik notunuzu giriniz: ");
        physic = scanner.nextDouble();
        points.add(physic);

        double chemical = 0;
        System.out.println("Kimya notunuzu giriniz: ");
        chemical = scanner.nextDouble();
        points.add(chemical);

        double turkish = 0;
        System.out.println("Türkçe notunuzu giriniz: ");
        turkish = scanner.nextDouble();
        points.add(turkish);

        double history = 0;
        System.out.println("Tarih notunuzu giriniz: ");
        history = scanner.nextDouble();
        points.add(history);

        double music = 0;
        System.out.println("Müzik notunuzu giriniz: ");
        music = scanner.nextDouble();
        points.add(music);

        int validPointsCount = 0;
        int sum = 0;
        double average = 0;

        //do involve which is valid
        for(int i = 0; i < points.size(); i++){
            double currentPoint = points.get(i);
            if(currentPoint >= 0 && currentPoint <= 100)
            {
                sum += currentPoint;
                validPointsCount++;
            }
        }

        average = sum / validPointsCount;

        String resultMessage = (average >= 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalama : " + average + " " + resultMessage);

    }
}
