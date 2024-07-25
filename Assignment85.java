
//WAP to remove all capital letters in a given string  ?

public class Assignment85 {

	public static void main(String[] args) {

		String Name = "Automation Testing";

		String N2 = Name.replaceAll("[A-Z]", "");
		System.out.println("Output After Removing Capital Alphabets:- " + N2);
	}

}
