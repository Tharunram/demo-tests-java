package Advanced_java_Practice;
/*The program prints on screen the even numbers. This happens since whenever the modulus results
of ‘i’ by 2 are not equal to ‘0’, the ‘continue’ statement forces loop to iterate bypassing the following 
statement (modulus refers to the remainder of dividing ‘i’ by 2). */
public class Useofcontinue_ex23 {

	public static void main(String[] args) {
		int i=0,j=0 ;
		for(i=0;i<=100;i++) {
			if(i%2!=0)continue; {
				System.out.println(i);
				//i=j;
//			}for(j=0;j<=100;j++) {
//				if(j%2==1) {
//					System.out.println(j);
				//}
									
			}
		}

	}

}
