package seleniumjavaframework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.googlesearchpageobj;

public class Testobj_googleseacrh 
{

	static WebDriver driver = null;
	
public static void main(String[] args) 
	{
	
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/librar/chromedriver.exe");
		
		WebDriverManager.chromedriver().version("73.0.3683.68").setup();
		driver = new ChromeDriver();	
		
		googlesearchpageobj searchpajeobj = new googlesearchpageobj(driver);
		
		driver.get("https://google.com");
		
		searchpajeobj.setTextInsearchbox("youtube");
		searchpajeobj.EnterSearchbox();
		
		driver.close();


	}

}
