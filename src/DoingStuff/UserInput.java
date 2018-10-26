package DoingStuff;

import java.util.Scanner;

/**
 *
 * @author Robert Palmer
 */
public class UserInput {
    public static void main(String[] args) throws Exception {
        /** 
         * Scanner allows users to input data. This function creates an
         * object that can be used to input data.
         *
         */ 
        Scanner systemInScanner = new Scanner(System.in);
        System.out.printf("enter an integer: ");
        // This variable holds the first number that user inputs
        int firstInt = systemInScanner.nextInt();
        System.out.printf("enter another integer: ");
        // This variable holds the second number that user inputs
        int secondInt = systemInScanner.nextInt();
        
        // The product variable holds the result of the product of two numbers
        int product = FirstFunction.multiply(firstInt, secondInt);
        System.out.printf("%d * %d = %d\n", firstInt, secondInt, product);
    }
}
