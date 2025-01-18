package Practicec;

/*Here x and y are doubles and so we have loss of precision when converting to 
integer. We have no loss when converting the integer 100 to byte, but when trying to convert 257 to 
byte we have loss of precision as 257 exceeds the size which can hold byte. Finally we have casting 
from byte to char.*/
public class Typecasting_ex19 {
	public static void main(String[]args) {
		double x,y;
		byte b;
		int a; 
		char ch;
		x=8.45;
		y=7.96;
		a=(int)(x/y);
		System.out.println("Integer outcome of x / y: "+a);
		a=100;
		b=(byte)a;
		System.out.println("b value is:"+b);
		a=166;
		b=(byte)a;
		System.out.println("b value is:"+b);
		a=85;
		ch=(char)b;
		System.out.println("b value is:"+ch);
		
	}

}
