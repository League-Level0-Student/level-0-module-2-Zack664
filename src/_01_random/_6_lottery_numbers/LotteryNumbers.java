package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(20);
		int randomNumber2 = randomMaker.nextInt(20);
		int randomNumber3 = randomMaker.nextInt(20);
		int randomNumber4 = randomMaker.nextInt(20);
		int randomNumber5 = randomMaker.nextInt(20);
		int randomNumber6 = randomMaker.nextInt(20);
		
		JOptionPane.showMessageDialog(null, randomNumber+" "+randomNumber2+" "+randomNumber3+" "+randomNumber4+" "+randomNumber5+" "+randomNumber6);
		
	}

}
