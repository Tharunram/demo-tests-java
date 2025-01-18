package Practicec;

/*this program shows that y is initialized each time the code belonging to the looping sequence is 
executed; therefore y is reset to -1 each time and then set to 100. This operation is repeated for 
three (3) times.*/


public class example_17 {
	public static void main(String[]args) {
		int x;
		for(x=0;x<3;x++) {
			int y=-1;
			System.out.println("Y is here:"+y);
			y=100;
			System.out.println("Y is here:"+y);
			
		}
	}

}
