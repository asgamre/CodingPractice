/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asgam
 */
public class Quick1 {
    
         static void partition(int[] ar) {
              int pivot = ar[0];
              ArrayList<Integer> left = new ArrayList<Integer>();
              ArrayList<Integer> right = new ArrayList<Integer>();
              ArrayList<Integer> equal = new ArrayList<Integer>();
              ArrayList<Integer> finallist = new ArrayList<Integer>();
              
              for(int i=1;i<ar.length;i++){
                  if(ar[i]<pivot)left.add(ar[i]);
                  else if(ar[i]>pivot)right.add(ar[i]);
                  else if(ar[i]==pivot)equal.add(ar[i]);
              }
              int j=0;
              finallist.addAll(left);
              finallist.add(pivot);
              finallist.addAll(equal);
              finallist.addAll(right);
              int finalarray[] = new int[finallist.size()];
              for(int i=0;i<finalarray.length;i++)
                  finalarray[i] = finallist.get(i).intValue();
              printArray(finalarray);
              
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
}
