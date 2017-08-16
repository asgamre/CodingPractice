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
public class SepTheNum {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int queries = in.nextInt();
	for(int i = 0; i < queries; i++) {
		String s = in.next();
		boolean valid = false;
		long firstDigit = -1;
		// Try each possible starting number
		for (int j=1; j<=s.length()/2; j++) {
			long currentDigit = Long.parseLong(s.substring(0,j));
			firstDigit = currentDigit;
		   // Build up sequence starting with this number
			String test = Long.toString(currentDigit);
			while (test.length() < s.length()) {
				test += Long.toString(++currentDigit);
			}
			// Compare to original
			if (test.equals(s)) {
				valid = true;
				break;
			}
		}
		System.out.println(valid ? "YES " + firstDigit : "NO");
	}
}
}
