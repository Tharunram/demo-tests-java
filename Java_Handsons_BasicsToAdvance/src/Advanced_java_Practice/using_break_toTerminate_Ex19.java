package Advanced_java_Practice;

public class using_break_toTerminate_Ex19 {
	public static void main(String []args) {
		int num=100;
		for(int i=0;i<100;i++) {
			if(i*i>=num) break;
			System.out.print(i + " ");// terminate loop if i*i >= 100
/* When i = 10, i*i = 100. Therefore 
the ‘if’ condition is satisfied and 
the loop terminates before i = 100
*/

		}
		System.out.println("Loop complete.");
	}

}
