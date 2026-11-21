/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method.with.parameters.pkgreturn.values;

import java.util.Scanner;

/**
 *
 * @author huawei
 */
public class MethodWithParametersReturnValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total: ");
        int total = input.nextInt();

        System.out.print("Enter count: ");
        int count = input.nextInt();

        double average = computeAverage(total, count);

        System.out.println("Average: " + average);

        input.close();
    }
     public class AverageCalculator {

    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 1.0;
        }

        return (double) total / count;
    }
    }
}      
   /* 1. Why does the method need the word double(or a cast) in the return?
    * Answer: It needs double so the answer can have decimal values and not just whole numbers.

    * 2. What would go wrong without the <=0 guard?  
    * Answer: the program might divide by zero or accept an invalid negative count, 
    * which could result in an incorrect answer or an error.

