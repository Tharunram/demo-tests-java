package Practicec;

public class Scopeandlifetimeodvariable_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		if(x==10){
			int y=20;
			System.out.println("x and y:"+ x +" "+y);
			x=y*2;
			
			
		}
		// y = 100; // Error! y not known here
		// x is still known here.
		System.out.println("x is: "+x);
	}

}

/* If we had to remove the comment marks from the line, y = 100; we would get an
 * error during compilation as y is not known since it only exists within the
 * block of code following the ‘if’ statement.
 */