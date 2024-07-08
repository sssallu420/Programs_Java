
// WAP on constructor calling with and without parameters

public class Assignment14
{

	
	public Assignment14()    //constructor with out parameter
	{
		System.out.println("this is constructer without parameter");
	}
	
	public Assignment14(String name)   //constructor with parameter
	{
		System.out.println("this constructor with parameter");
	}
	
	public static void main(String[] args)  //main method 
	{
		
		//	constructor with parameter
		
		Assignment14 n1= new Assignment14();  //creating an object for constructor
		//System.out.println(n1);
		
		
   //		constructor without parameter
		
		Assignment14 n2= new Assignment14("Testing");
	//	System.out.println(n2);
		 
	}
}
