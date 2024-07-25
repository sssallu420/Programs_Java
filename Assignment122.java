

//WAP on Encapsulation for getter & setter?

public class Assignment122 {

	private int Pin = 24;

	public int getpin() 
	{  
		return Pin;
	}

	public void setpin(int Pin) {

		this.Pin = Pin;
	}

	public static void main(String[] args) {

		Assignment122 p1 = new Assignment122();

		p1.setpin(20);
		System.out.println(p1.getpin());
	}
}
