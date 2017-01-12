package Challenges;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;

/**
 *
 * @author willi
 */
public class ArraysDS {
    
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    
    // Create Scanner class to get input from STDIN.
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter size of array");
    int numberOfInts = input.nextInt();
    
    int intArray[] = new int[numberOfInts];
    
    System.out.println("Please enter " + numberOfInts + " numbers");
    
    for (int i = 0; i < numberOfInts; i++) {
        int nextInt = input.nextInt();
        intArray[i] = nextInt;
    }
    
    for (int j = numberOfInts - 1; j >= 0; j--) {
        System.out.print(intArray[j] + " ");
    }
    
    System.out.println();
    
    }
    
}
