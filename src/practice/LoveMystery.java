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
public class LoveMystery {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int x=0;x<n;x++){
     String s = sc.next();
     int count=0;
     int i=0, j=s.length()-1;
     while(i<j){
     count+=Math.abs(s.charAt(i)-s.charAt(j));    
     i++;j--;
     }
         System.out.println(count);
     }
 }   
}
