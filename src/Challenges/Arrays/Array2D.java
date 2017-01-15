/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges.Arrays;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class Array2D {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);
        
        int[][] array2D = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array2D[i][j] = scan.nextInt();
            }
        }
        
        int largestSum = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                int sum = array2D[i][j-1] +
                          array2D[i][j]   +
                          array2D[i][j+1] +
                          array2D[i+1][j] +
                          array2D[i+2][j-1] +
                          array2D[i+2][j]   +
                          array2D[i+2][j+1];
                
                if (i == 0 && j == 1) {
                    largestSum = sum;
                }
                else if (sum > largestSum) {
                    largestSum = sum;
                }
            }
        }
        
        System.out.println(largestSum);
        
    }
}
