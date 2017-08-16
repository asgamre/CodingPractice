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
public class IceCream {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int maxcost = sc.nextInt();
            int size = sc.nextInt();
            int types[] = new int[size];
            for(int j = 0; j < size; j++){
            types[j] = sc.nextInt();
        }
            findflavours(types,maxcost);
        }
    }
    static void findflavours(int types[],int maxcost){
        Map<Integer,Integer> flavourmap = new HashMap<>();
        flavourmap.put(types[0], 1);
        for(int i=1;i<types.length;i++){
            Integer k = flavourmap.get(maxcost - types[i]);
            if(k == null){
                flavourmap.put(types[i], i+1);
            }
            else{
                System.out.println(k+" "+(i+1));
                break;
            }
        }
    }
}
