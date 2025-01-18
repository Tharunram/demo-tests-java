package Practicec;

/*This program illustrates the difference between automatic conversion and casting. When we 
are assigning a byte to integer, i = b * b, the conversion is automatic. When performing an arithmetic 
operation the byte type are promoted to integer automatically, but if we want the result as byte, we 
have to cast it back to byte. This explains why there is the statement: b = (byte) (b * b). Casting has 
to be applied also if adding variables of type char, as result would else be integer.*/
public class Typecasting_ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		int i;
		i=b*b;  // OK, no cast needed
		System.out.println("i is :"+i);
		b=10;
		b=(byte)(b*b); // cast needed!! as cannot assign int to byte
		System.out.println("i and b: " + i + " " + b);

		
		

	}

}
