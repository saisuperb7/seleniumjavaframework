package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class googlesearchpageobj 

{

	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	
	public googlesearchpageobj(WebDriver driver)
	{
		this.driver = driver;
	}

	public void setTextInsearchbox (String text) 
	{

	driver.findElement(textbox_search).sendKeys("Youtube");

	}
	
	public void EnterSearchbox()
	
	{
	driver.findElement(textbox_search).sendKeys(Keys.ENTER);
	}

}
