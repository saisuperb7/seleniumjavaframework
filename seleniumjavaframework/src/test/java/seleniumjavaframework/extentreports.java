package seleniumjavaframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentreports {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");  
		
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        ExtentTest test = extent.createTest("google search", "searching on google");
        test.log(Status.INFO, "starting test case");
        
        String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/librar/chromedriver.exe");
		
		WebDriverManager.chromedriver().version("73.0.3683.68").setup();
		driver = new ChromeDriver();	
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test.pass("test pass");
		
		extent.flush();
		
		driver.close();
		driver.quit();
		
	}
}
