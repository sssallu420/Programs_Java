
//input mismatchexception with all the methods of scanner class


import java.util.Scanner;

public class Assignment40   //class 
{

	public static void main(String[] args)  //main method 
	{
		Scanner s1 = new Scanner(System.in);   //scaneer class
		
		System.out.println("enter the string");    
	     s1.next("testing");
		System.out.println("enter the int value");
		s1.nextInt();
		
		System.out.println("enter the byte");
		s1.nextByte();
		
		System.out.println("enter the boolena");
		s1.nextBoolean();
		
		System.out.println("enter the double ");
		s1.nextDouble();
	}
}
