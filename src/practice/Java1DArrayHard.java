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
public class Java1DArrayHard {
 
    static boolean winsGame(int game[], int jump, int currentPos, int lastJumpPos){
    boolean win = false;
    int pointer = currentPos;
    while(pointer < game.length-1 && game[pointer+1]==0){
    pointer++;
    }
    if(pointer == game.length-1)return true;
    int temp = pointer;
    while(temp>lastJumpPos && game[temp-1]==0 && (temp+jump)>pointer+1){
    temp--;
    }
    currentPos = temp;
    for(int i=currentPos;i<=pointer;i++){
        if((i+jump)<game.length && game[i+jump]==0 && jump!=0)
            win = winsGame(game, jump,i+jump,i);
        if(win || (i+jump)>=game.length || (i+1)>=game.length)
            win = true;
        break;
    }
    return win;
    }
       
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        int size = sc.nextInt();
        int jump = sc.nextInt();  
        int game[] = new int[size];
        for(int j=0;j<size;j++){
        game[i]=sc.nextInt();
        }
        if(winsGame(game,jump,0,0))
            System.out.println("YES");
        else
        System.out.println("NO");
    }
       
    }
}
