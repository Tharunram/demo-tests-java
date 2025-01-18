package Advanced_java_Practice;
/*he conditional expressions are evaluated from the top downward. As soon as a true condition is 
found, the statement associated with it is executed, and the rest of the ladder is bypassed. If none of 
the conditions is true, the final else statement will be executed. The final else often acts as a default 
condition; that is, if all other conditional tests fail, the last else statement is performed. If there is no 
final else and all other conditions are false, no action will take place. */

public class if_else_if_ladder_ex4 {
	public static void main(String[] args) {
		// Demonstrate an if-else-if ladder.
		int x;
		for (x = 0; x<6; x++) {
			if (x == 1) {
				System.out.println("x is one");
			} else if (x == 2) {
				System.out.println("x is two");
			} else if (x == 3) {
				System.out.println("x is three");
			} else if (x == 4) {
				System.out.println("x is four");
			} else if (x == 5) {
				System.out.println("x is five");
			} else {
				System.out.println("x is not in range 1 and 5");
			}
		}

	}
}
