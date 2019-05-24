package seleniumjavaframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class first {
	
	@Test
	public static void facebook() {
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/librar/chromedriver.exe");
		
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();*/
		
		WebDriverManager.chromedriver().version("73.0.3683.68").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
	
}
