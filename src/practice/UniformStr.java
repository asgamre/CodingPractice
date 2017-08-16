/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
/**
 *
 * @author asgam
 */
public class UniformStr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int queries = sc.nextInt();
        int count = 1;
        int lastpos = 0;
        char ch[] = input.toCharArray();
        Set<Integer> numset = new HashSet<Integer>();
        for(int i=0;i<ch.length;i++){
            int pos = ch[i] - 'a' + 1;
            if(pos==lastpos){
                count++;
            }
            else{
            count = 1;
            lastpos=pos;
            }
            int value = count * pos;
            numset.add(value);
        }
        for(int i=0;i<queries;i++){
        int x = sc.nextInt();
        if(numset.contains(x))System.out.println("Yes");
        else System.out.println("No");
        }
    }
}
