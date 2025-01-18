package Advanced_java_Practice;


public class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
  

	
	void range() {
		// TODO Auto-generated method stub
			System.out.println("Range is " + (fuelcap * mpg));
/*  Note that ‘fuelcap’ and ‘mpg’ are called directly without the dot (.) operator.
Methods take the 
following general form:
ret-type name( parameter-list ) {
// body of method
} */
	}

	
}
