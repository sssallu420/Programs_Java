
// WAP on area of circle using maths class

import java.util.*;

public class Assignment28 
{
	
	    public static void main(String[] args) //main method
	    {
	        Scanner s1 = new Scanner(System.in);  //scanner class in side method

	        // Prompt user for the radius
	        
	        System.out.print("Enter the radius of the circle: ");
	        
	        double radius = s1.nextDouble(); //using scanner class double 

	        // Calculate the area using Math.PI and Math.pow
	        
	        double area = Math.PI * Math.pow(radius, 2);

	        
	        
	        System.out.println("The area of the circle is: " + area);
	    }
	}



