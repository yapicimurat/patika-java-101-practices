package homework2;

import java.util.Scanner;

public class App {

    //Manav Kasa Programı


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        double pearKG = scanner.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double appleKG = scanner.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double tomatoKG = scanner.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double bananaKG = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        double eggplantKG = scanner.nextDouble();


        double price = (pearKG * FruitPrices.PEAR) + (appleKG * FruitPrices.APPLE) + (tomatoKG * FruitPrices.TOMATO) +
                (bananaKG * FruitPrices.BANANA) + (eggplantKG * FruitPrices.EGGPLANT);

        System.out.println("Toplam Tutar: " + price + " TL");


    }


}

class FruitPrices{
    public static final double PEAR = 2.14;
    public static final double APPLE = 3.67;
    public static final double TOMATO = 1.11;
    public static final double BANANA = 0.95;
    public static final double EGGPLANT = 5.0;
}
