
//WAP on given string to find out how many are numeric letters present?

public class Assignment71

{
	static int count_of_numericdigit = 0;

	public static void main(String[] args) // Main method

	{

		String R1 = "Saurabh Airtel Number 4503388123"; // string combination of alphanumeric

		// System.out.println(R1);

		char R2[] = R1.toCharArray(); // string to char array

		for (int i = 0; i <= R1.length(); i++) // for loop
		{
			boolean B1 = Character.isAlphabetic(R2[i]); // boolena

			if (B1 == true) // if statment
			{
				count_of_numericdigit++;
			}

			{

				System.out.println("number of alphabets : " + count_of_numericdigit++);
			}
		}
	}
}
