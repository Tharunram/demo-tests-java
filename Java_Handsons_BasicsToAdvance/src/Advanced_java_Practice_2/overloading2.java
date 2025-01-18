package Advanced_java_Practice_2;

public class overloading2 {

	public static void main(String[] args) {
		AutoTypeConvforOverloadedMethods atcfo= new AutoTypeConvforOverloadedMethods();
		 int i=87;
		 double d=23.45;
		 byte b=99;
		 short s =10;
		 float f=11.5F;
		 
		 atcfo.f(i);
		 atcfo.f(d);
		 atcfo.f(b);
		 atcfo.f(s);
		 atcfo.f(f);

	}

}
