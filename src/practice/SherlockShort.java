/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import static practice.Sherlock.leftSumRightSum;
import java.util.Scanner;

/**
 *
 * @author asgam
 */
public class SherlockShort {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=0;i<n;i++){
         int size = sc.nextInt();
         int array[] = new int[size];
         for(int j=0;j<size;j++)array[j]=sc.nextInt();
         leftSumRightSum(array);
     }
    }
    static void leftSumRightSum(int array[]){
    int i=0;
    int j=array.length-1;
    int sum=0;
    while(i!=j){
    if(sum>=0){
        sum -= array[j];
        j--;
    }
    else{
        sum += array[i];
        i++;
    }
    }
    if(sum==0)System.out.println("YES");
    else System.out.println("NO");
    }
}
