package Advanced_java_Practice;

public class Ternary_operator_ex5 {

	public static void main(String[] args) {
/*Notice the if statement. If i is zero, then the outcome of the if is false, the division by zero is
prevented, and no result is displayed. Otherwise the division takes place */
		for(int i = -5;i<6;i++) {
			if(i!=0?true:false) {
				System.out.println("100/" +i+ "= "+100/i);
			}
		}

	}

}
