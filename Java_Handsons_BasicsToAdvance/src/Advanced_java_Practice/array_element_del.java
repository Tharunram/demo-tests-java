package Advanced_java_Practice;

import java.util.Arrays;

public class array_element_del {

	    public static void main(String[] args) {
	        int[] myArray = {10, 20, 30, 40, 50};

	        // Remove the third element (index 2)
	        int indexToRemove = 2;
	        for (int i = indexToRemove; i < myArray.length - 1; i++) {
	            myArray[i] = myArray[i + 1];
	        }

	        // Resize the array (optional)
	        myArray = Arrays.copyOf(myArray, myArray.length - 1);

	        // Print the modified array
	        System.out.println(Arrays.toString(myArray));
	    }
	}


