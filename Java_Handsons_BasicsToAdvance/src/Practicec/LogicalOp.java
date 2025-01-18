package Practicec;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a=10;
		b=2;
		if(b!=0 &&(a%b)==0) {
			System.out.println(b+ " is a factor of " +a);
		}
//		b=0;
//		if(b!=0 &&(a%b)==0){
//			System.out.println(b+ " is a factor of " +a);
//		}
		b=0;
		if(b!=0 &(a%b)==0){
			System.out.println(b+ " is a factor of " +a);
		}
//* Note:if you try to execute the above program you will get an error (division by zero). To be able to 
//		execute it, first comment the last two statements, compile and then execute		
			

	}

}
