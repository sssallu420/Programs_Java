
//this keyword 

public class Assignment121 {

	String name;
	int no;
	int MobileNo;

	void candidate(int no, double salary, String name) {
		this.name = name;
		this.no = no; // local to global
		this.MobileNo = MobileNo;
		
	}

	public static void main(String[] args) {

		Assignment121 en = new Assignment121();

		en.candidate(42, 894561230, "Abhilash");

		System.out.println(en.name);
		System.out.println(en.MobileNo);
		System.out.println(en.no);
	}

}
