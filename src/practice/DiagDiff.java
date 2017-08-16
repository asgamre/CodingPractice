/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
/**
 *
 * @author asgam
 */
public class DiagDiff {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int matrix[][]=new int[n][n];
     int leftsum=0;
     int rightsum=0;
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             matrix[i][j] = sc.nextInt();
         }
     }
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(i==j)leftsum = leftsum + matrix[i][j];
         }
         rightsum = rightsum + matrix[i][n-i-1];
     }
     System.out.println(Math.abs(leftsum-rightsum));
 }   
}
