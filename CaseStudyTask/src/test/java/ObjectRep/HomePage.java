package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static WebElement search(WebDriver w)
	{
		return w.findElement(By.id("txtSearch"));
	}
	
	

}
