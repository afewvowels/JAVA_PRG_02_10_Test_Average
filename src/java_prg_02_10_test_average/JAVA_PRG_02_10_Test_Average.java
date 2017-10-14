/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_10_test_average;

import java.util.Scanner;

/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter three test scores. The program
 * should display each test score, as well as the average of the scores.
 */
public class JAVA_PRG_02_10_Test_Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float FLT_TESTS_COUNT = 3.0f;
        
        // Declare variables for user input and average test score
        float fltTest01;
        float fltTest02;
        float fltTest03;
        float fltTestAverage;
        
        // Create keyboard
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Display prompt and get first test score
        System.out.print("Please enter the first test score: ");
        fltTest01 = scrKeyboard.nextFloat();
        
        // Display prompt and get second test score
        System.out.print("\nPlease enter the second test score: ");
        fltTest02 = scrKeyboard.nextFloat();
        
        // Display prompt and get third test score
        System.out.print("\nPlease enter the final test score: ");
        fltTest03 = scrKeyboard.nextFloat();
        
        // Calculate test average
        fltTestAverage = (fltTest01 + fltTest02 + fltTest03) / FLT_TESTS_COUNT;
        
        // Format and output final average along with test scores to console
        System.out.println("\nWith test scores of " + fltTest01 + ", " +
                            fltTest02 + ", and " + fltTest03 + ",\nyour average " +
                            "test score is: " + fltTestAverage);
    }
    
}
