package seleniumjavaframework;

import org.testng.annotations.Test;
import config.PropertiesFile;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.googlesearchpageobj;

public class testng {

	static WebDriver driver = null;
	public static String browserName = null;
	@BeforeTest
	public void setuptest() 
		
	{
		
			String projectpath = System.getProperty("user.dir");
			System.out.println(projectpath);
			PropertiesFile.getProperties();
			if (browserName.equalsIgnoreCase("chrome"))
			{	
			System.setProperty("webdriver.chrome.driver",projectpath+"/librar/chromedriver.exe");
			WebDriverManager.chromedriver().version("73.0.3683.68").setup();
			driver = new ChromeDriver();	
			}
			else
			{
				
			}
	}
	
	@Test
	public void googlesearch() 
	{
			googlesearchpageobj searchpajeobj = new googlesearchpageobj(driver);
			
			driver.get("https://google.com");
			
			searchpajeobj.setTextInsearchbox("youtube");
			searchpajeobj.EnterSearchbox();
			


	}
	
	@AfterTest
	public void teardowntest()
	{
	
			driver.close();
			System.out.println("test completed succesfully");
	}
	
	
	}
