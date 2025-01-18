package Advanced_java_Practice;
//Declare loop variable inside the for.
public class Declaring_variables_inLoop_ex13 {

	public static void main(String[] args) {
		int sum=0;
		int fact=1;
		// compute the factorial of the numbers through 5
		for(int i=1;i<=5;i++) {
			// i is known throughout the loop
			sum+=i;
			fact*=i;
			
		}
		// but, i is not known here.
		System.out.println("Sum is"+sum);
		System.out.println("fact is"+fact);
	}

}
