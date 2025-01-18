package Advanced_java_Practice;

public class Sorting_anArray_Bubble_Sortt {

	public static void main(String[] args) {
		int num[]= { 99, -10, 100123, 18, -978,5623, 463, -9, 287, 49 };
		int a,b,c;
		int size=10;
		System.out.print("original array is:");
		for(int i=0;i<size;i++) 
			System.out.print(" " + num[i]);
		System.out.println();
		
		for( a=1;a< size;a++) 
			for( b=size-1;b>=a;b--) {
				if(num[b-1]> num[b]) {
					 c =num[b-1];
					num[b-1]=num[b];
					num[b]=c;
					
				}
			}
		System.out.print("Sorted array is:");
		for(int i=0;i<size;i++) 
			System.out.print(" " + num[i]);
		System.out.println();

	}

}
