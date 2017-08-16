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
public class MarsExploration {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String input =  sc.next();
     int count=0;
     for(int i=0;i<=input.length()-3;i+=3){
         if(!input.substring(i, i+3).equals("SOS")){
             String sub = input.substring(i, i+3);
             for(int j=0;j<sub.length();j++){
             if(j%2==0){
                 if(sub.charAt(j)!='S')count++;
             }
             else{
                 if(sub.charAt(j)!='O')count++;
             }
             }
         }
     }
     System.out.println(count);
 }   
}
