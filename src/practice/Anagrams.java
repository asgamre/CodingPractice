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
public class Anagrams {
    static int makingAnagrams(String s1, String s2){
        // Complete this function
        Map<Character,Integer> map1=makeMap(s1);
        Map<Character,Integer> map2=makeMap(s2);
        System.out.println(map1);
        System.out.println(map2);
        int count=0;
        for(char key:map1.keySet()){
            int diff=0;
                        if(!map2.containsKey(key)){
                            count=count+map1.get(key);
                        }
		    }
        System.out.println("count "+count);
        for(char key:map2.keySet()){
            int diff=0;
                         if(!map1.containsKey(key)){
                            count=count+map2.get(key);
                        }
                         else{
                            if(map1.get(key).equals(map2.get(key)))continue;
                            else{
                                count = count + Math.abs(map2.get(key)-map1.get(key));
                            }
                        }
		    }
        System.out.println("count "+count);
        System.out.println(map1);
        System.out.println(map2);
        return count;
    }

    static Map makeMap(String s){
    Map<Character,Integer> map1=new HashMap<>();
    for(int j=0;j<s.length();j++){
		        if(map1.containsKey(s.charAt(j))){
		            map1.put(s.charAt(j),map1.get(s.charAt(j))+1);
		        }
		        else{
		            map1.put(s.charAt(j),1);
		        }
		    }
    return map1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
