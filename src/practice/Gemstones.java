/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
import java.util.HashSet;
import java.lang.Character;
/**
 *
 * @author asgam
 */
public class Gemstones {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     Set<Character> set = convertToSet(sc.next());
     for(int i=1;i<n;i++){
         set.retainAll(convertToSet(sc.next()));
     }
        System.out.println(set.size());
    }
    static Set<Character> convertToSet(String s){
        Set<Character> set = new HashSet<Character>(26);
        for(char ch:s.toCharArray())
            set.add(ch);
        return set;
    }
}
