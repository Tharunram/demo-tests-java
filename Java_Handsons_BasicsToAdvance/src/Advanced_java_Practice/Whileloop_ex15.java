package Advanced_java_Practice;

public class Whileloop_ex15 {

	public static void main(String[] args) {
		int e;
		int result;
		for(int i=0;i<10;i++) {
			result=1;
			e=i;
			while(e>0) {
				result*=2;
				e--;
				
			}
			System.out.println("2 to the power of " + i + " is " + result);
			
		}


	}

}			
			
			/*
			 * The for loop iterates from i = 0 to i = 9 (inclusive). 
	
	 		Inside the loop:		 
			 result is set to 1. 
			 e is assigned the current value of i.
			 The while loop runs
			 as long as e is greater than 0. In each iteration of the while loop, result
			 is multiplied by 2, and e is decremented by 1.
			 * 
			 * 
			 * The final result after all iterations is a large number: 35184372088832
			 */

