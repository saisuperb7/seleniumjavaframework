package seleniumjavaframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.googlesearchpage;

public class Test_googlesearch {

	static WebDriver driver = null;
	public static void main(String[] args)
	
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/librar/chromedriver.exe");
		
		WebDriverManager.chromedriver().version("73.0.3683.68").setup();
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		//WebElement text = driver.findElement(By.name("q"));
		//googlesearchpage.textbox_search(driver);
		googlesearchpage.textbox_search(driver).sendKeys("Youtube");
		googlesearchpage.textbox_search(driver).sendKeys(Keys.ENTER);
		driver.close();
		
	}

}