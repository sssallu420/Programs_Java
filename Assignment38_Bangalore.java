
//Multi level inheritance using static and nonstatic methods


/*
class Bidar  //sub super most class
{
	static void add()
	{
		System.out.println("this static in super most classs");
	}
}

class Karnataka extends Bidar   //sub super class 
{
	static void sub()     //static class
	{
		System.out.println("this is static in super class");
	}
}

public class Assignment38_Bangalore extends Karnataka  //child class get releation ship with help of key word extends 

{
	static void div()                        //static class
	{
		System.out.println("this is static in child class");
	}
	
	
	public static void main(String[] args)    //main method 
	{
	
	add();  //we can call the static method without creating an object
	sub();
	div();
	
	}
}
  

*/

// nonstatic methods





class Bidar  //sub super most class
{
	void add()            //non static method 
	{
		System.out.println("this static in super most classs");
	}
}

class India extends Mysore   //sub super class 
{
	void sub()     // non static class
	{
		System.out.println("this is static in super class");
	}
}

public class Assignment38_Bangalore extends Karnataka  //child class get releation ship with help of key word extends 

{
	void div()                        // non static class
	{
		System.out.println("this is static in child class");
	}
	
	
	public static void main(String[] args)    //main method 
	{
	
		Assignment38_Bangalore a1 = new Assignment38_Bangalore();   //object created in child class to call non static method 
		
		a1.add();
		a1.div();
		a1.sub();
	
	
	}
}