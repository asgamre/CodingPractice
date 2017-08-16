/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

public class Reverse {
 public static void main(String argsp[]){
     Scanner sc = new Scanner(System.in);
     String input  = sc.nextLine();

     char inputarray[]  = input.toCharArray();
     int n = inputarray.length;
     reverse(inputarray,0,n-1);
     System.out.println(new String(inputarray));
     reverseword(inputarray,n);
     System.out.println(new String(inputarray));
 } 
 static void reverse(char inputarray[],int i,int j){
     while(i<j){
         char t = inputarray[i];
         inputarray[i++] = inputarray[j];
         inputarray[j--] = t;         
     }
 }
 static void reverseword(char inputarray[],int n){
     int i=0;
     int j=0;
    while (i < n) {
      while (i < j || (i < n && inputarray[i] == ' ')){ i++; 
//      System.out.println(i+"i");
      } // skip spaces
      while (j < i || (j < n && inputarray[j] != ' ')){ j++;
//      System.out.println(j+"j");
      } // skip non spaces
      reverse(inputarray,i,j-1);                      // reverse the word
    }
 }
} 