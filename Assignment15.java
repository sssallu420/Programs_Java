

//Write a program on combination of method overloading and constructor overloading


public class Assignment15   //classs
{
	
	static void add ()  //static method 
	{
		System.out.println("this is methord overLoading");
	}
	
	
	Assignment15_()      //constructor method 
	{
		System.out.println("this construction OverLoading");
	}
	
	
	
	public static void main(String[] args)   //main method 
	
	{
		add(); //static method 
		
		
		Assignment15_ n1= new Assignment15_();   //object created for constructor 
		System.out.println();     // this Constructive over loading 
		
		
	}
}
