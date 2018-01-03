package Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObjects.BusquedaGoogle;

/*TestCase:
    	AutomationExercise
	Given the following simple test case:
---------------------------------------------------
	- Given I want to go to the 'www.seleniumhq.org' Page
	- When I go to 'www.google.com'
	- and I type 'Seleniumhq' in the searchbox
	- and I press 'ENTER' in the searchbox
	- and I click on 'Selenium HQ' link
	- Then I´m on Selenium HQ Page
	
*/

public class Test_SeleniumHQPage {
		
	static WebDriver driver;
	static String browser = "chrome";
	static String PathDrivers = "C:\\AutomationExercise\\Driver\\";
   
    

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
		switch (browser){	
		case "chrome":
			System.setProperty("webdriver.chrome.driver", PathDrivers+"chromedriver.exe");
			driver = new ChromeDriver();	
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", PathDrivers+"geckodriver.exe");
			driver = new FirefoxDriver();	 
			break;
		}
	
	}
	
	@Test
	public void testBusqueda() {
		
		BusquedaGoogle Busqueda = new BusquedaGoogle(driver);
		Busqueda.Buscar("Seleniumhq");
		Busqueda.ClickEnBusqueda("http://www.seleniumhq.org/");
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.seleniumhq.org/");
		
	}
	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
}
