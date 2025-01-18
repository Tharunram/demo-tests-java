package Practicec;

public class math_class_ex1 {
	public static void main(String args[]) {
		double x,y, z,z1,z2;
		x=6;
		y=8;
		z=Math.sqrt(x*x + y*y);
		z1=Math.max(x*x , y*y);
		z2=Math.round(x*x + y*y);
		System.out.println("Hypotenuse is "+z);
		System.out.println("Hypotenuse is "+z1);
		System.out.println("Hypotenuse is "+z2);
	}

}
/*
 * Please note that whenever a method is called, a particular nomenclature is
 * used where we first specify the class that the particular method belongs to,
 * e.g. Math.round( ); where Math is the class name and round is the method
 * name. If a particular method accepts parameters, these are placed in
 * brackets, e.g. Math.max(2.8, 12.9) – in this case it would return 12.9 as
 * being the larger number. A useful method is the Math.random( ) which would
 * return a random number ranging between 0.0 and 1.0.
 */
