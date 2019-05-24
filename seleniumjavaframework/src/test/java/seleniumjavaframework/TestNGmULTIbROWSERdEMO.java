package seleniumjavaframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGmULTIbROWSERdEMO {

	
	static WebDriver driver = null;
	
	//@Optional("TestNGmULTIbROWSERdEMO")
	@Parameters("browserName")
	@BeforeTest
	public void setup(@Optional("Insert folder name here or leave empty") String browserName)
	{
	System.out.println("inside test1"+browserName);
	
	if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("inside chrome");
			System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver_win32_74\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	else if(browserName.equalsIgnoreCase("firefox"))
		{
		
		
		}
	}
	
	
	
	@Test
	public void test2()
	{
	driver.get("https://google.com");
	System.out.println("inside test2");
		
	}
	
	@Test
	public void teardown()
	{
		driver.close();
	System.out.println("inside test3");
	}
}

