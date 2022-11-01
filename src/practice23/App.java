package practice23;


public class App {


    public static void main(String args[]){

        System.out.print(fibonacci(5));

    }


    private static int fibonacci(int n)
    {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
