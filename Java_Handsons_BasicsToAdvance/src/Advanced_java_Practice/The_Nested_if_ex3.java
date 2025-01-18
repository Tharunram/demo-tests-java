package Advanced_java_Practice;

import java.io.IOException;

public class The_Nested_if_ex3 {

	public static void main(String[] args) throws IOException {
		char ch,letter = 'k';
		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");
		ch=(char)System.in.read();
		if(ch==letter) {
			System.out.println("your right");
		}
		if(ch<letter) {
			System.out.println("too low");
		}else{
			System.out.println("Opps too high");
		}
		
		

	}

}
