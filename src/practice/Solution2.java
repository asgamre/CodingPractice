/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author asgam
 */
public class Solution2 {
  public int[] solution(String A, String B) {
        // write your code in Java SE 8
        HashMap<Character, Integer> uniqueCharacters = new HashMap<>();
        HashMap<String, Integer> characterOccuranceCount = new HashMap<>();
        HashMap<Character, Integer> substringCharacterOccuranceCount = new HashMap<>();
        for(int i = 0; i < A.length(); i++) {
            if(!uniqueCharacters.containsKey(A.charAt(i)) && A.charAt(i) != ' ') {
                uniqueCharacters.put(A.charAt(i), 0);
            }
        }
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != ' ') {
                uniqueCharacters.put(A.charAt(i), uniqueCharacters.get(A.charAt(i)) + 1);
            }
            else {
                for(Character key: uniqueCharacters.keySet()) {
                    String value = key + String.valueOf(uniqueCharacters.get(key));
                    if(characterOccuranceCount.containsKey(value)) {
                        characterOccuranceCount.put(value, characterOccuranceCount.get(value) + 1);
                    }
                    else {
                        characterOccuranceCount.put(value, 1);
                    }
                }
            }
        }
        for(String key: characterOccuranceCount.keySet()) {
            System.out.println(key + " " + characterOccuranceCount.get(key));
        }
        List<Integer> abc = new ArrayList<>();
        return new int[B.length()];
    }  
}
