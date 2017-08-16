/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class MapTest{
   public static void main(String []argh)
   {
       Map phonebook = new HashMap();
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         phonebook.put(name,String.valueOf(phone));
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         String result = (String)phonebook.get(s);
         if(result!=null)System.out.println(s + "=" + result);
          else System.out.println("Not found");
      }
   }
}
