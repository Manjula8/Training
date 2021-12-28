package ObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public static WebElement getEmail(WebDriver w)
	{
		return w.findElement(By.id("i0116"));
	}
	
	public static WebElement clickNext(WebDriver w)
	{
		return w.findElement(By.id("idSIButton9"));
	}
	
	public static WebElement getPassword(WebDriver w)
	{
		return w.findElement(By.id("i0118"));
	}
	
	public static WebElement clickSignIn(WebDriver w)
	{
		return w.findElement(By.xpath("//input[@value = 'Sign in']"));
	}
	
	public static WebElement clickYes(WebDriver w)
	{
		return w.findElement(By.xpath("//input[@value = 'Yes']"));
	}

}
