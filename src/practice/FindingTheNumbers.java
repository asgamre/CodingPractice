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
public class FindingTheNumbers {
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int N;
		for(int i=0;i<testCases;i++){
		    N = sc.nextInt();
		   int array[] = new int[2*N+2];
                   for(int j=0;j<array.length;j++){
                       array[j] = sc.nextInt();
                   }
		    Map<Integer,Integer> intCounter=new HashMap<Integer,Integer>();
		    for(int j=0;j<array.length;j++){
		        if(intCounter.containsKey(array[j])){
		            intCounter.put(array[j],intCounter.get(array[j])+1);
		        }
		        else{
		            intCounter.put(array[j],1);
		        }
		    }
		    for(Integer key:intCounter.keySet()){
//                        if(intCounter.get(key)==1)
		        System.out.print(key+" "+intCounter.get(key)+"\n");
		    }
                    System.out.println();
		}
	}
}
