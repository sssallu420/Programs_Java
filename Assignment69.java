

import java.util.Arrays;

//WAP to store 5 types of  data together using Array

public class Assignment69 {
	public static void main(String[] args) 
	
	{
		Object[] Store = new Object[5]; // Object is key word used store the multiput datatypes

		Store[0] = 42; 		       // int
		Store[1] = 45785; 		  // long
		Store[2] = 0.25;		 // float
		Store[3] = true; 		// boolean
		Store[4] = "Saurabh"; // String

		System.out.println(Arrays.toString(Store));
	}
}
