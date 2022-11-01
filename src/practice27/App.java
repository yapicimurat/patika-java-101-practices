package practice27;

public class App {

    public static void main(String args[]){
        double harmonic, sum = 0, harmonicAverage = 0.0;

        int[] list = {1, 2, 3, 4, 5};

        for (int i = 0; i < list.length; i++) {
            harmonic = 1.0 / i;
            sum += harmonic;
            harmonicAverage = list.length / sum;
        }

        System.out.println("Harmonik ortalama: " + harmonicAverage);
    }

}
