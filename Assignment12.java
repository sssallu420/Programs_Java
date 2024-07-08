
// Calling Static method  with and without parameters inside main method



public class Assignment12 
{

	// Static method without parameters
	
     static void message() 
    {
        System.out.println("Hi this is static with out parameter");
    }

    // Static method with parameters
    
     static void message( String name )
    {
        System.out.println(" Hi this is static with Parameters");
    }
    
    static void message( float a )
    {
        System.out.println(" hi this data type is float ");
    }

    public static void main(String[] args) 
    {
        // Calling the static method without parameters
    	
    	
        message();
        
        // Calling the static method with parameters
        
        message("Automation batch");
        
        message(7.15f);
    }
	
}
