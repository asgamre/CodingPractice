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
public class Quick2 {
    static int partition(int[] ar,int left, int right) {
              int pivot = ar[left];
              ArrayList<Integer> leftlist = new ArrayList<Integer>();
              ArrayList<Integer> rightlist = new ArrayList<Integer>();
              for(int i=left+1;i<right;i++){
                  if(ar[i]<pivot)
                      leftlist.add(ar[i]);
                  else rightlist.add(ar[i]);
              }
              for(int i=0;i<leftlist.size();i++){
                  ar[left+i] = leftlist.get(i);
              }
              ar[left+leftlist.size()]=pivot;
              for(int i=0;i<rightlist.size();i++){
                  ar[left+leftlist.size()+1+i] = rightlist.get(i);
              }
              System.out.println("Returning"+(left+leftlist.size()));
              return left+leftlist.size();
    }   
    
    static void quick(int ar[],int left,int right){
        if (right - left >= 2) {
	 	   int pivot = partition(ar, left, right);
                   System.out.println("1 "+left+"left and pivot"+pivot);
	 	   quick(ar, left, pivot);
                   System.out.println("2 "+(pivot+1)+"pivot and right"+right);
	 	   quick(ar, (pivot + 1), right);
                   System.out.println("3 "+left+"left and right"+right);
	 	   printArray(ar,left,right);
        }
        System.out.println("break ho gaya bc");
    }
    
 
 static void printArray(int[] ar,int left,int right) {
         for(int i=left;i<right;i++){
            System.out.print(ar[i]+" ");
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
           quick(ar,0,n);
       }    

}
