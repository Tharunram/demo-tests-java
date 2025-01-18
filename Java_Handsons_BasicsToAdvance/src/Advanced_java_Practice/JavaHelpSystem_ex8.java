package Advanced_java_Practice;

import java.io.IOException;

public class JavaHelpSystem_ex8 {

	public static void main(String[] args) throws IOException {
		char choice;
		System.out.println("Help on:");
		System.out.println("1.if");
		System.out.println("2.switch");
		System.out.println("Choose One:");
		choice=(char)System.in.read();
		System.out.println("\n");
		switch(choice) {
		case 1:
			System.out.println("the if:\n");
			System.out.println("if(condition)");
			System.out.println("else statement;");
			break;
		case 2:
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println(" case constant:");
			System.out.println(" statement sequence");
			System.out.println(" break;");
			System.out.println(" // ...");
			System.out.println("}");
			break;
			default:
			System.out.print("Selection not found.");
			/*default clause catches invalid choices. For 
			example, if the user enters 3, no case constants 
			will match, causing the default sequence to 
			execute*/
			
		}
			

	}

}
