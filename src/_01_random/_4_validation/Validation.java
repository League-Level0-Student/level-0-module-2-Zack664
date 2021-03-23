//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.



// 2. Repeat all the code above 10 times
		for (int i=0; i<4; i++) {
			System.out.println();
			
		}
		if (randomNumber ==0){ 
			JOptionPane.showMessageDialog(null, "Your Shirt looks Good");
        } else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You're cool");
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Your shoes are straight fire");
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "nice shades");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "I like yo cut G");
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
