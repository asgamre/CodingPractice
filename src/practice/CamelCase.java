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
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=0;
        if(s.length()!=0)count=1;
        char ch[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]>=65 && ch[i]<=90)
                count++;
        }
        System.out.println(count);
    }
}
