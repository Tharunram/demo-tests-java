package Advanced_java_Practice;

import java.io.IOException;

public class The_if_statement_ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n, number =55;
		System.out.println("iam thinking to number between 1 to 100");
		System.out.println("can you guess the number:");
		n =(int)System.in.read();
		if(n==number) {
			System.out.println("**right answer**");
		}else {
			System.out.println("Opps worng answer");
		}

	}

}
