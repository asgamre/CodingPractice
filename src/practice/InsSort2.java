/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author asgam
 */
public class InsSort2 {
    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        int i = 0;
        int j =0;
        while(i<ar.length-1){
            j = i;
            while(j>=0 && j+1<ar.length && ar[j]>ar[j+1]){
            int t = ar[j+1];
            ar[j+1]=ar[j];
            ar[j]=t;
                j--;
            }
            printArray(ar);
            i++;
//            System.out.println("i"+i);
//            System.out.println("j"+j);
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }

}
