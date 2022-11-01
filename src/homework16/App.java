package homework16;

public class App {


    public static void main(String[] args){
        int[][] matrice = {
            {12,3},
            {4,5,6}
        };
        int[][] transpoze = new int[3][2];

        System.out.println("Matrice :");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                transpoze[j][i] = matrice[i][j];
            }
        }

        System.out.println("Transpoze : ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }



}
