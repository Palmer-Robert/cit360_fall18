/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoingStuff;

/**
 *
 * @author palmerfam
 */
public class FirstFunction {
    public static int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    
    public static void main(String[] args) {
        int product = FirstFunction.multiply(3, 4);
        System.out.printf("%d\n", product);
    }
}
