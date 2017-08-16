/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author asgam
 */
public class Grid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x=0;x<n;x++){
            int size = sc.nextInt();
            char matrix[][] = new char[size][size];
            for(int i=0;i<size;i++){
                matrix[i]=sc.next().toCharArray();
                Arrays.sort(matrix[i]);
            }
//            System.out.println();
            rearrangeGrid(matrix,size);
        }
    }
    static void rearrangeGrid(char [][]matrix,int size){       
//         for(int i=0;i<size;i++){
//                for(int j=0;j<size;j++){
//                    System.out.print(matrix[i][j]);
//                }
//                System.out.println();
//            }
//         
         boolean OK = true;
            for (int j = 0; j < size; j++) {
                for (int i = 1; i < size; i++) {
                    if (matrix[i][j] < matrix[i-1][j]) OK = false;
                }
            }
            if(OK==true)
            System.out.println("YES");
            else System.out.println("NO");
    }
}
