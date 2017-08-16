/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author asgam
 */
public class MissingNumbers {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n1 = sc.nextInt();
     int array1[] = new int[n1];
     for(int i=0;i<n1;i++)array1[i]=sc.nextInt();
     int n2 = sc.nextInt();
     int array2[] = new int[n2];
     for(int i=0;i<n2;i++)array2[i]=sc.nextInt();
     Map<Integer,Integer> map1= convertToMap(array1);
     Map<Integer,Integer> map2= convertToMap(array2);
     ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(map1);
//        System.out.println(map2);
    for(Map.Entry<Integer,Integer> x:map2.entrySet()){
    if(!map1.containsKey(x.getKey()) || map1.get(x.getKey())<x.getValue())
            list.add(x.getKey());
    }    
    Collections.sort(list);
    for(int i=0;i<list.size();i++)
            System.out.println(list.get(i)+" ");
    }
    static Map<Integer,Integer> convertToMap(int array[]){
        Map<Integer,Integer> intcount = new HashMap<>();
        for(int i:array)
            if(intcount.containsKey(i))intcount.put(i, intcount.get(i)+1);
            else
            intcount.put(i,1);
        return intcount;        
    }

}
