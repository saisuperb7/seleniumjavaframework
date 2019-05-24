package listeners;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.googlesearchpage;
import pageobj.googlesearchpageobj;

@Listeners(listeners.testNGListeners.class)
public class testNGListenerDemo 
{
	static WebDriver driver = null;
	
	@Test(groups = {"sanity", "smoke"})
	public void test1()
	
	{
		System.out.println("test1");
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		//System.setProperty("webdriver.chrome.driver",projectpath+"/librar/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver_win32_74\\chromedriver.exe");
		//WebDriverManager.chromedriver().version("74.0.3729.131").setup();
		 driver = new ChromeDriver();
		
		
		//driver.close();
		googlesearchpageobj searchpajeobj = new googlesearchpageobj(driver);
		
		driver.get("https://google.com");
		
		searchpajeobj.setTextInsearchbox("youtube");
		searchpajeobj.EnterSearchbox();
		//driver.close();
	}

	@Test(groups = {"regression"})
		public void test2()
		{
			System.out.println("test2");
			Assert.assertTrue(false);
		}
	

	@Test(groups = {"regression","sanity"})
		public void test3()
		{
			System.out.println("test3");
			throw new SkipException("skipped");
		}
	
	@Test(groups = {"windows.regression"})
	public void test4()
	{
		System.out.println("test4");
		//throw new SkipException("skipped");
	}

}
