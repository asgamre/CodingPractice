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
public class ZeroOneZero {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String B = sc.next();
        System.out.println((B.length() - B.replaceAll("010", "").length())/3);
    }
}
