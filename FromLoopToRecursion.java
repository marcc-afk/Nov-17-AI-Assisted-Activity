/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package from.loop.to.recursion;

import java.util.Scanner;

/**
 *
 * @author huawei
 */
public class FromLoopToRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Grade Number? ");
        int size = input.nextInt();
        int[] grades = new int[size];
        
        for (int i = 0; i < grades.length; i++){
            System.out.print("Enter Grade " + (i+1) + ": ");
            grades[i] = input.nextInt();
        }
        System.out.print("Enter Passing Mark: ");
        int passingMark = input.nextInt();
        System.out.println("Loop: " + countPassing(grades, passingMark));
        System.out.println("Recursive: " + countPassingRecursive(grades, passingMark, 0));
    }

    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;
        for (int g : grades) {
            if (g >= passingMark) {
                count++;
            }
        }
        return count;
    }

    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index == grades.length) {
            return 0;
        }
        if (grades[index] >= passingMark){
            return 1 + countPassingRecursive(grades,passingMark, index + 1);
        }
       return countPassingRecursive(grades,passingMark, index + 1);
    }
}
   /* 1. What does each recursive call do to index, and why must it change?
    * Answer: Each recursive call changes the index to move to the next position in the list or array.
    * It must change so the function can process the next element and avoid repeating the same call forever. 

    * 2. What happens if you delete the base case entirely?
    * Answer: If you delete the base case, the recursive function will keep calling itself without stopping.
    * This causes infinite recursion and may eventually lead to a stack overflow error.


