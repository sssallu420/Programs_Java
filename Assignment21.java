
//Calling Non-static method inside main method

public class Assignment21   //class inside the package 
{

	public void add()       //non static method
	{
		System.out.println("this is Nonstatic Methord ");
	}
	
	public void sub()  //non static method 
	{
		
		System.out.println("this is nonstatic methord 2");
	}
	
	public static void main(String[] args)  //main method 
	{
		Assignment21 N1= new Assignment21();  //object created for class and then called with refrence variable name 
		
		N1.add();
		N1.sub();
		 				
		
	}
	
}
