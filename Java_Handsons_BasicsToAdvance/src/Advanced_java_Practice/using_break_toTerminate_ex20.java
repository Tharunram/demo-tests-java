package Advanced_java_Practice;

import java.io.IOException;

public class using_break_toTerminate_ex20 {

	public static void main(String[] args) throws IOException {
		char ch;
/* In this program there is an infinite loop, for( ; ; ) . This means that the program will 
never terminate unless the user presses a particular letter on the keyboard, in this case ‘q’.*/
		for( ; ; ) {
			ch=(char)System.in.read();
			if(ch=='q') {
				break;
			}else 
				System.out.println("You wrong!");
			
		}
		System.out.println("You pressed q!");

	}

}
