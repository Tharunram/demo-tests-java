package Advanced_java_Practice;

public class One_dimentional_arrays {
	public static void main(String args[]) {
		int sample[]= new int[10];
		int i;
		for(i=0;i<10;i+=i);
		sample[i]=i;
		for(i=0;i<10;i+=i);
		System.out.println("This is sample[" + i + "]:" +sample[i]);
	}

}
