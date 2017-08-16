package practice;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        ArrayList<String> array = new ArrayList<String>();
        String split[]=s.split("(!|,|\\?|\\.|\\_|'|@|\\s)");
        for(int i=0;i<split.length;i++)
            array.add(split[i]);
        array.remove("");
        System.out.print(array.size()+"\n");
        for(int i=0;i<array.size();i++){
            if(!split[i].equals("\\s"))
            System.out.print(array.get(i)+"\n");
        }
        scan.close();
    }
}
