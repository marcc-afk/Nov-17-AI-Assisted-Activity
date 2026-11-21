/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debug.the.ai_.fixing.a.flawed.recursion;

import java.util.Scanner;

/**
 *
 * @author huawei
 */
public class DebugTheAI_FixingAFlawedRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        System.out.println("Result: " + factorial(number));
        
        input.close();
    }
    public static int factorial(int n) {
        
        if (n <= 0){
            return 1;
        }
        return n * factorial(n - 1);
    }    
}
    //* 1.Why did one wrong return make every result wrong?
    //* Answer: One wrong return can make every result wrong because each recursive call depends
    //* on the value return by the previous call. If one return has an incorrect value,
    //* the error affects all the calculations that depends on it.

    //* 2.Stretch: what happens for factorial(-2) with your corrected code, and why?
    //* Asnwer: The corrected code should display an error or reject the input because factorial
    //* is only defined for non-negative integers. Negative numbers cannot reach the base
    //* properly in the usual recursive factorial function.