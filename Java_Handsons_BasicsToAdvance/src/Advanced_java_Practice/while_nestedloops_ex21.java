package Advanced_java_Practice;
/* 
 1.Outer Loop (for loop):
->The for loop initializes an integer variable i to 0.
->It runs as long as i is less than 3.
->In each iteration of the outer loop:
 >It prints "Outer loop count: " followed by the value of i.
 >It initializes an integer variable t to 0.
 >It enters the inner while loop.
2.Inner Loop (while loop):
->The inner while loop runs as long as t is less than or equal to 100.
->In each iteration of the inner loop:
>It checks if t is equal to 10. If true, it breaks out of the loop.
>Otherwise, it prints the value of t followed by a space.
>It increments t by 1.
3.Overall Behavior:
->The outer for loop runs 3 times (since i goes from 0 to 2).
->The inner while loop runs multiple times (up to 100) unless t becomes 10.
->The output will show the values of t printed in a single line, separated by spaces. */
public class while_nestedloops_ex21 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			System.out.println("Outer loop count: ");
			System.out.println("Inner loop count: ");
			int t=0;
			while(t<=100) {
				if(t==10)break;
				System.out.print(t+ " ");
				t++;	
			}
			System.out.println();
		}
		System.out.println("Loops complete.");

	}

}
