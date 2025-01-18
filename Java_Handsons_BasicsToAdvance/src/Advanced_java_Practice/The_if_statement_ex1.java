package Advanced_java_Practice;

import java.io.IOException;

/*Guessing Game (Guess.java)
The program asks the player for a letter between A and Z. If the player presses the correct letter on 
the keyboard, the program responds by printing the message **Right **. */
public class The_if_statement_ex1 {
	public static void main(String[]args) throws IOException {
		char ch, letter='k';
		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.println("can you guess it:");
		ch=(char)System.in.read();
		if(ch==letter) {
			System.out.println("your right.");
		}else {
			System.out.println("Oops Wrong answer!");
		}
		
	}

}
