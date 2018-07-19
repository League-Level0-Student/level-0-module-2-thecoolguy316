package random;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are ya?");
int AGED = Integer.parseInt(age);
if (AGED >= 18) {
	JOptionPane.showInputDialog("Who do you think the next president is going to be?");
	
}
else
	JOptionPane.showMessageDialog(null, "Get outa here kid!");
}


}
	

