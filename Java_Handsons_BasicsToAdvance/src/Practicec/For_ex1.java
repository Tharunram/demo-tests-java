
package Practicec;
/*. In the this example we will be using a 
counter which starts at 0 and ends 
when it is smaller than 5, 
i.e. 4. Therefore the code following the 
for loop will iterate for 5 times.
Instead of count = count+1, this increments the counter, we can use count++. 
The following table shows all the available shortcut operators:
Operator Description 		Example Description
++		Increment 			a++ 	a = a + 1 (adds one from a)
--      Decrement 			a-- 	a = a – 1 (subtract one from a)
+= 		Add and assign 		a+=2 	a = a + 2 
-= 		Subtract and assign a-=2 	a = a – 2
*= 		Multiply and assign a*=3 	a = a * 3
/= 		Divide and assign 	a/=4 	a = a / 4
%= 		Modulus and assign 	a%=5 	a = a mod 5
*/


public class For_ex1 {

	public static void main(String[] args) {
		int count;
		for(count=0;count<5;count=count+1) {
			System.out.println("this is count:"+count);
		}
		System.out.println("Done!");

	}

}
