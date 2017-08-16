/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.io.*;
import java.util.*;

public class ExampleOne {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        ArrayList<ArrayList> arraylist = new ArrayList<ArrayList>();
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            ArrayList<Integer> integerlist = new ArrayList<Integer>();
            for(int j=0;j<d;j++){
                integerlist.add(sc.nextInt());
            }
//            System.out.println(integerlist);
            arraylist.add(integerlist);
            
        }
//        System.out.println(arraylist);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
        if(x<arraylist.size() && y<arraylist.get(x).size())
                System.out.println(arraylist.get(x).get(y));
        else 
                System.out.println("ERROR!");
        }
        
        
    }
}