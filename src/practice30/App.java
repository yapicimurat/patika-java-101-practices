package practice30;

public class App {


    public static void main(String[] args) {
        int[] list = {2, 3, 5, 3, 1, 5, 6, 3, 2, 2, 2, 3, 4, 5, 77};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if(!isExist(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }

        for (int value: duplicate) {
            if ((value!= 0) && (value % 2 != 1)) {
                System.out.println(value);
            }
        }

    }

    public static boolean isExist(final int[] arr, final int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
