
//  Calling Non-Static method  with and without parameters inside main method

public class Assignment13
{

	//non static without parameters
	
		void message ()
		{
			System.out.println("this non static without parameters");
		}
		
		void message ( String Name)
		{
			System.out.println("this non static with parameters");
		}

		public static void main(String[] args)
		
		{
			//with out parameters 
			
			Assignment13 c1= new Assignment13();
			
			c1.message();
			
			c1.message("Parameters");
		}
	
}
