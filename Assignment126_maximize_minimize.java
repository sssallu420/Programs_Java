
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment126_maximize_minimize {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
	}
}