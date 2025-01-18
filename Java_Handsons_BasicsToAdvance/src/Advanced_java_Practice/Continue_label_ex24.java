package Advanced_java_Practice;
/*Note that the inner loop is allowed to 
 execute until ‘j’ is equal to 5. 
 Then loop is forced to outer loop.
 */
public class Continue_label_ex24 {

	public static void main(String[] args) {
		outerloop:
			for(int i=1;i<10;i++) {
				System.out.print("\nOuterloop pass" +i+ ",Innerloop:");
				for(int j=1;j<10;j++) {
					if(j==5) continue outerloop;
					System.out.print(j);
					
				}
			}

	}

}
