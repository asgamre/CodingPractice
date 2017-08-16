/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author asgam
 */
public class Hackerrank {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     String str="hackerrank";
     for(int k=0;k<n;k++){
     String superstring = sc.next();
     if(superstring.length()<str.length())System.out.println("NO");
     int j=0;
     for(int i=0;i<superstring.length();i++){
         if(j<str.length() && superstring.charAt(i)==str.charAt(j))j++;
     }
     if(j==str.length())System.out.println("YES");
     else System.out.println("NO");
     }
}
}
