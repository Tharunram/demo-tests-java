package Advanced_java_Practice;

public class For_loop_ex9 {

	public static void main(String[] args) {
		// for(initialization; condition; iteration) statement;
		double num,sroot,rerr;
		for(num=10.0;num<101.0;num++) {
			sroot=Math.sqrt(num);
			System.out.println("square root of"+num +"is"+sroot);
			// compute rounding error
			rerr=num-(sroot*sroot);
			System.out.println("rounding error is "+rerr);
			System.out.println();
		}
	}

}
/*1.Initialization = assignment statement that sets the initial value of the loop control variable, 
(counter)
2.Condition = Boolean expression that determines whether or not the loop will repeat
3.Iteration = amount by which the loop control variable will change each time the loop is
repeated.*/

