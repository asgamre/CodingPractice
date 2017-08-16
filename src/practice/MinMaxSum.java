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
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        long min = Long.MAX_VALUE;
        long max = 0;
        long sum;
        for(int i=0; i < 5; i++){
            sum=0;        
        for(int j=0; j < 5; j++){
            if(i==j){
                continue;
            }
        sum = sum + arr[j];
        }
        if(sum>max)
            max = sum;
        if(sum<min)
            min = sum;
        }
        System.out.println(min+" "+max);
    }
}
