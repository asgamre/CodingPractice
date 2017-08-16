/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author asgam
 */
public class Cakewalk {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer array[] = new Integer[n];
        for(int i=0;i<n;i++)array[i]=sc.nextInt();
        Arrays.sort(array, Collections.reverseOrder());
        long c=0;
        for(int i=0;i<n;i++){
        c =(long) (c + array[i]*Math.pow(2,i));
        }
        System.out.println(c);
    }
}
