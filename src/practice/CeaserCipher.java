/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author asgam
 */
public class CeaserCipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        String input = sc.next();
        StringBuffer stringbuf = new StringBuffer(input);
        char a;
        int increment = sc.nextInt();
        for(int i=0;i<length;i++){
            char ch=stringbuf.charAt(i);
            if(Character.isAlphabetic(ch)){
                a = Character.isUpperCase(ch)?'A':'a';
                ch = (char)(a + (ch - a + increment)%26);
            }
            stringbuf.setCharAt(i, ch);
        }
        System.out.println(stringbuf.toString());
    }
}
