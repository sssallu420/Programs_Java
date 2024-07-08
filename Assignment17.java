

//WAP on updating global static and non static variable

public class Assignment17

{
	static  int a =20;  //static  method   Globel
	
	int b = 30;       //globel non static method 
	
	
	 public static void  main(String[] args)  //main method 
	
	{
		a=30;                    //static declerazation
		System.out.println(a);   //value updatation
		
			
		Assignment17 n1= new Assignment17();   //object created for non static method 
		n1.b=40;      							//creating a class to the non static methord 
		System.out.println(n1.b);
	}
}
