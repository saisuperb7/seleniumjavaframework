package seleniumjavaframework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.googlesearchpageobj;

public class extentreportwithtestng {
	
	
	static WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setuptest() 
		
	{
		
			String projectpath = System.getProperty("user.dir");
			System.out.println(projectpath);
			System.setProperty("webdriver.chrome.driver",projectpath+"/librar/chromedriver.exe");
			
			WebDriverManager.chromedriver().version("73.0.3683.68").setup();
			driver = new ChromeDriver();	
			
			htmlReporter = new ExtentHtmlReporter("extent.html");  
			
			extent = new ExtentReports();
			
	        extent.attachReporter(htmlReporter);
			
	}
	
	@Test
	public void googlesearch() throws IOException 
	{
			googlesearchpageobj searchpajeobj = new googlesearchpageobj(driver);
			
			driver.get("https://google.com");
			
			searchpajeobj.setTextInsearchbox("youtube");
			searchpajeobj.EnterSearchbox();
			ExtentTest test = extent.createTest("google search", "searching on google");
			test.log(Status.INFO, "starting test case");
	        test.info("This step shows usage of info(details)");
	        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        //test.addScreenCaptureFromPath("screenshot.png");

	}
	
	@AfterSuite
	public void teardowntest()
	{
		
			extent.flush();
			driver.close();
			System.out.println("test completed succesfully");
	}	

}
