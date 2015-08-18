package core;

//BEGIN
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Single_Title_Validation {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();    // Version 1.1 :: Firefox

	
		String url = "http://www.learn2testX.net";
		String title_expected = "learn2test.net";
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_actual = driver.getTitle();

		if (title_expected.equals(title_actual)) {
			System.out.println("Test Case Result: \t" + "PASSED");
		} else {
			System.out.println("Test Case Result: \t" + "FAILED");
		}
		driver.quit();
	}
}
//END
