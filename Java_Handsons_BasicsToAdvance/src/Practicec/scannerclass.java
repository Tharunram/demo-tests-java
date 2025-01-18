package Practicec;
import java.util.Scanner;

/*This class allows users to create an instance 
of this class and use its methods to perform input.
*/
public class scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=sc.nextInt();
		System.out.print("Enter second number : ");
		int b=sc.nextInt();
		System.out.print("Enter third number : ");
		int c=sc.nextInt();
		System.out.print("average is  : "+(a+b+c)/3);
		

	}

}
/*
  By examining the code we see that first we have to import the
  java.util.Scanner as part of the java.util package. Next we create an
  instance of Scanner and name it as we like, in this case we named it “input”.
  We have to specify also the type of input expected (System.in). The rest is
  similar to the program which uses the Keyboard class, the only difference is
  the name of the method used, in this case it is called nextInt ( ) rather
  than readInt( ). This time the method is called as part of the instance
  created, i.e. input.nextInt( )
 */
