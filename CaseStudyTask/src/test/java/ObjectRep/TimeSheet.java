package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeSheet {
	
	public static WebElement getTime(WebDriver w)
	{
		                               
		return w.findElement(By.xpath("/html/body/main/div/div[2]/section/div[4]/div[1]/div/div/div/div[2]/div/div[1]/span[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input"));
	}
	
	public static WebElement clickSave(WebDriver w)
	{
		return w.findElement(By.id("le_apply"));
	}

}
