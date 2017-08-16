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
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String a[] = String.valueOf(n).split("");
            int count=0;
            for(String i:a)
            {
                try{
                if(Integer.parseInt(i)!=0){
                    if(n%Integer.parseInt(i)==0)count++;
                }
                }
                catch(NumberFormatException e){}
            }
            System.out.println(count);
        }
    }
}