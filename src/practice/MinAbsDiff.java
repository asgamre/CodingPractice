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

public class MinAbsDiff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // your code goes here
        int mindiff=Integer.MAX_VALUE;
        int diff;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
                diff=Math.abs(a[i+1]-a[i]);
                //System.out.println("diff " + diff);
                if(diff<mindiff)
                    mindiff=diff;
        }
        System.out.println(mindiff);
    }
}
