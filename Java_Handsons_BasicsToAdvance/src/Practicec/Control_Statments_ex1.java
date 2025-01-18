package Practicec;

public class Control_Statments_ex1 {
	public static void main(String[]args) {
		int a,b,c;
		a=2;
		b=4;
		c=a-b;

		/*
		 * if(c>=0) { System.out.println("c is a positive number" +c); }
		 * 
		 * if(c<0){ System.out.println("c is a negative number" +c); } c=b+a; if(c>=0) {
		 * System.out.println("c is a positive number" +c); }
		 * 
		 * if(c<0){ System.out.println("c is a negative number" +c); }
		 */
		
		/*
		 * Whenever we write an IF statement or a loop, if there is more than one
		 * statement of code which has to be executed, this has to be enclosed in
		 * braces, i.e. ‘{ ….} -’
		 */
		if(c>=0) {
			System.out.println("c is a positive number"+c);
		}else {
			System.out.println("c is a negative number"+c);
			
		}
		c=a+b;
		if(c<0) {
			System.out.println("c is a positive number"+c);
		}else {
			System.out.println("c is a negative number"+c);
			
		}
		
	}

}
