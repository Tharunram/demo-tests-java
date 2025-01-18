package Advanced_java_Practice;

import java.io.IOException;

public class forloop_terminating_aLoop {

	public static void main(String[] args) throws IOException {
		int i;
		System.out.println("Press S to stop.");
		for(i=0;(char)System.in.read()!='s';i++) {
			
			System.out.println("Pass #" + i);

		}
	}

}
