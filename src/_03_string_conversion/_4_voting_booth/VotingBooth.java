package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	
	public static void main(String[] args) {
	
		String ageToVote=JOptionPane.showInputDialog("How old are you?");
		int ageAsInt = Integer.parseInt(ageToVote);
		if (ageAsInt >= 18) JOptionPane.showMessageDialog(null,"You can Vote!"); { }
		if (ageAsInt <= 18) JOptionPane.showMessageDialog(null,"Sorry you can't Vote!"); { }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
