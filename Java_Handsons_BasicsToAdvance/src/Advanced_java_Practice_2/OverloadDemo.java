package Advanced_java_Practice_2;

public class OverloadDemo {
	public static void main(String args[]) {
		Overload ob= new Overload();
		int resI;
		double resD;
		ob.ovlDemo();
		System.out.println();
		ob.ovlDemo(4);
		System.out.println();
		resI=ob.ovlDemo(4,6);
		System.out.println("Two parameters"+resI);
		resD=ob.ovlDemo(4.45,6.36);
		System.out.println("Two double parameters"+resD);
	}

}
