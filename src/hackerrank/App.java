package hackerrank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfTestCase = scanner.nextInt();

        List<String> values = new ArrayList<String>();
        String outputMessage = "";

        for(int i = 1; i <= amountOfTestCase; i++){
            values.add(scanner.next());
        }

        for(int i = 0; i < values.size(); i++){
            boolean any = false;
            String currentValueOutput = "";

            final String currentValueAsString = values.get(i);
            Long convertedAsLong = 0l;
            try{
                convertedAsLong = Long.parseLong(currentValueAsString);
            }catch(Exception exception){
                currentValueOutput += currentValueAsString +" can't be fitted anywhere. \n";
                outputMessage += currentValueOutput;
                continue;
            }

            currentValueOutput += currentValueAsString + " can be fitted in:\n";

            if(convertedAsLong >= Byte.MIN_VALUE && convertedAsLong <= Byte.MAX_VALUE){
                any = true;
                currentValueOutput += "* byte\n";
            }

            if(convertedAsLong >= Short.MIN_VALUE && convertedAsLong <= Short.MAX_VALUE){
                any = true;
                currentValueOutput += "* short\n";
            }

            if(convertedAsLong >= Integer.MIN_VALUE && convertedAsLong <= Integer.MAX_VALUE){
                any = true;
                currentValueOutput += "* int\n";

            }

            if(convertedAsLong >= Long.MIN_VALUE && convertedAsLong <= Long.MAX_VALUE){
                any = true;
                currentValueOutput += "* long\n";
            }


            if (!any){
                currentValueOutput = currentValueAsString + "can't be fitted anywhere.";
            }


            outputMessage += currentValueOutput;

        }

        System.out.println(outputMessage.substring(0, outputMessage.length() - 1));


    }
}
