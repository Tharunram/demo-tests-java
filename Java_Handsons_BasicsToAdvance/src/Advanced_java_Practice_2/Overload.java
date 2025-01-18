package Advanced_java_Practice_2;
/*The term overloading refers to the act of using the same method/constructor name in a class but 
different parameter declarations. Method overloading is an example of Polymorphism. */
public class Overload {
	void ovlDemo(){
		System.out.println("NO PARAMETRS");
		
	}
	void ovlDemo(int a) {
		System.out.println("One parameter: " + a);
		
	}
	int ovlDemo(int a,int b) {
		System.out.println("Two  parameters: " +a + " "+ b);
		return a+b;
	}
	
	double ovlDemo(double a,double b) {
		System.out.println("Two double parameters: " +a + " "+ b);
		return a+b;
	}

}
