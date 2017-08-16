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
public class UniformStrBrute {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> alpha = new HashMap<Character,Integer>();
        char ch = 'a';
        alpha.put(ch, 1);
        ch++;
        for(int i=2;i<=26;i++){
            alpha.put((char)(ch++), i);
        }
//        System.out.println(alpha);
        String input = sc.next();
        Map<String,Integer> mapsum = new HashMap<String,Integer>();
        for(int i=0;i<input.length();i++){
            int count;
            int j=i;
                if((j==input.length()-1 && input.charAt(i)!=input.charAt(i-1))||(input.charAt(i)!=input.charAt(i+1)))
                    mapsum.put(input.charAt(i)+"", alpha.get(input.charAt(i)));
                else{
                    count = 1;
                while(input.charAt(i)==input.charAt(i+1)){
                count++;
                String key = input.charAt(i)+"";
                int value = alpha.get(input.charAt(i));
                mapsum.put(key, value);
                for(int k=1;k<count;k++){
                    key = key + "" + input.charAt(i);
                    value = value + alpha.get(input.charAt(i));
                    mapsum.put(key, value);
                }
                i++;
//                    System.out.println("i"+i);
                }
                }
//                System.out.println("i Outside"+i);
        }
        int queries = sc.nextInt(); 
        for(int i=0;i<queries;i++){
        int query = sc.nextInt();
        if(mapsum.containsValue(query))System.out.println("Yes");
        else System.out.println("No");
        }
//        System.out.println(mapsum);
    }
}
