

// super calling with paramterised and non parameterised using Constructor


 /*
class Birds     //contructor class 
{
	Birds ()
	{
		System.out.println("This is Birds Constrctor");
	}
	
}

class Animals extends Birds        
{
	
	Animals ()          //contructor class 
	{
		System.out.println("this animal constructor");
	}
	
	
}
public class Assignment39_Human extends Animals            
{
    
	Assignment39_Human()             //contructor class 
	{	
		
		System.out.println("this is excute constructor");
	}
	
	public static void main(String[] args)
	{
		Assignment39_Human h1 = new Assignment39_Human();
	}
	
}

 */



//parameterized contructor 


class Birds
{
	Birds ()
	{
		System.out.println("This is Birds Constrctor");
	}
	
}

class Animals extends Birds
{
	
	Animals (String name)
	{
		System.out.println("this animal constructor");
	}
	
	
}
public class Assignment39_Human extends Animals 
{
    
	   Assignment39_Human()
	{	
		  super("Automation_testing");             //parameterized statement 
		  
		System.out.println("this is excute constructor");
	}
	
	public static void main(String[] args)
	{
		Assignment39_Human h1 = new Assignment39_Human();  //creating the object to class
	}
	
}