/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsSort {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
        int i = ar.length-1;
        int t = ar[i];
        i--;
        while(i>=0 && t<ar[i]){
            ar[i+1] = ar[i];
            i--;
//            System.out.println("i"+i);
            printArray(ar);
        }
        ar[++i]=t;
        printArray(ar);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
