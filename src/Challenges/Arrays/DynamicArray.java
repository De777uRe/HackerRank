/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author willi
 */
public class DynamicArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numSequences = input.nextInt();
        int numQueries = input.nextInt();
        
//        System.out.println("numSequences: " + numSequences);
//        System.out.println("numQueries: " + numQueries);
        
        input.nextLine();
        
        List<List<Integer>> seqList = new ArrayList<>(numSequences);
        
        for (int i = 0; i < numSequences; i++) {
            seqList.add(new ArrayList<>());
        }
        
        int lastAns = 0;
        
        for (int i = 0; i < numQueries; i++) {
            int queryType = input.nextInt();
//            System.out.println("queryType: " + queryType);
            int x = input.nextInt();
//            System.out.println("x: " + x);
            int y = input.nextInt();
//            System.out.println("y: " + y);
            if (queryType == 1) {
                seqList.get((x ^ lastAns) % numSequences).add(y);
            }
            else if (queryType == 2) {
                if (!seqList.get((x ^ lastAns) % numSequences).isEmpty() &&
                     seqList.get((x ^ lastAns) % numSequences).get(y % seqList.get((x ^ lastAns)% numSequences).size()) != null ) {
                    lastAns = seqList.get((x ^ lastAns) % numSequences).get(y % seqList.get((x ^ lastAns ) % numSequences).size());
                    System.out.println(lastAns);
                }
            }
        }
    }
}
