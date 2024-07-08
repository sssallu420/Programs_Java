

//WAP on GLobal Variable static and non static varaible calling  ?

public class Assignment16
{
	
	 static int a = 16;  //it should be static because we can access easly 
	
	String Name = "Automation Testing";
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println(a);
		
		Assignment16_ a1 = new Assignment16_();
		
		System.out.println(a1.Name);
		
	}
}
