

//WAP with parameterized constructor in SIB,IIB Concept?

public class Assignment124 {

	static {
		System.out.println("SIB");
	}

	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	{
		System.out.println("IIB3");
	}

	Assignment124() {
		System.out.println("Constructor without parameterized");
	}

	Assignment124(String Name) {
		System.out.println("Constructor Parameterized");
	}

	public static void main(String[] args) {

		System.out.println();

		Assignment124 a1 = new Assignment124();

		Assignment124 a2 = new Assignment124("Abhilash");

	}

}
