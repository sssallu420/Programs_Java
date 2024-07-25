

//WAP to reverse a string value

public class Assignment67

{       public static void main(String[] args) 
{
		String Name = "Pasikanti Saurabh"; // creating a string with the help of String Name keyword

		String n1 = Name.toLowerCase();      //convert into the lower case
		System.out.println(n1);

		String reverse = "";     //Reverse the string

		for (int i = n1.length() - 1; i >= 0; i--) // keyword use var.length

		{ // for loop
			char c1 = n1.charAt(i); // keyword use var.charAt()
			reverse = reverse + c1; // concatenate each character to reverse
		}

		System.out.println(reverse);
	}
}
