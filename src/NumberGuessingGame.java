import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {
public static void main(String[] args) {
	Random f = new Random();
	int number = f.nextInt(3);
	String guess = JOptionPane.showInputDialog(null, "Enter a number between 0-2!");
	int NumGuess=Integer.parseInt(guess);
	if(number==(NumGuess)) {
		
	}
}
}
