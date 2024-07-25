//Create class and inherit property of interface?

interface Gmail  //Interface class with abstract methods 
{
	void login();
	void Password();
}

public class Assignment48 implements Gmail   //Implements 

{
	@Override
	public void login()  //implementation from interface method
	{
		System.out.println("login email id");
	}

	@Override
	public void Password()
	{
		System.out.println("email password");
	}

	public static void main(String[] args)  //main Method
	{
		Assignment48 A1 = new Assignment48(); //Creating an object for class 

		A1.login();
		A1.Password();
	}
}
