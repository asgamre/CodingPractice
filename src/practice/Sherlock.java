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
public class Sherlock {
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
        if(array.length==1)System.out.println("YES");
        int left = 0;
        int right = array.length-1;
        int mid = (left+right)/2;
        for(int i=0;i<array.length;i++){
        if(mid==array.length-1){
            System.out.println("NO");
            break;
        }
//            System.out.println("mid"+mid);
        if(calcSum(array,left,mid-1)<calcSum(array,mid+1,right)){    
        mid = mid + 1;
        }
        else if(calcSum(array,left,mid-1)==calcSum(array,mid+1,right)){
            System.out.println("YES");
            break;
        }
        }
    }
    
    static int calcSum(int []array,int i,int j){
    int sum=0;
    for(int x=i;x<=j;x++){
//        System.out.println("x "+array[x]);
        sum+=array[x];
//        System.out.println("sum "+sum);
    }
//    System.out.println("Sum"+sum);
    return sum;
    }
}
