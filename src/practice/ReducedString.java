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
public class ReducedString {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     StringBuffer s = new StringBuffer(sc.nextLine());
     for(int i=1;i<s.length();i++){
         if(s.charAt(i)==s.charAt(i-1)){
             s.delete(i-1, i+1);
             i=0;
         }
     }
     if(s.length()==0)System.out.println("Empty String");
     else  System.out.println(s);
 }   
}
