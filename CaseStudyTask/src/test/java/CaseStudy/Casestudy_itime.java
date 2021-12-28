package CaseStudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRep.HomePage;
import ObjectRep.Login;
import ObjectRep.TimeSheet;

public class Casestudy_itime {
	WebDriver w;
  @Test
  public void ItimeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjula_m\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  w = new ChromeDriver();
	  w.get("https://www.myhcl.com");
	  w.manage().window().maximize();
	  w.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  Login.getEmail(w).sendKeys("manjula_m@hcl.com");
	  Login.clickNext(w).click();
	  Login.getPassword(w).sendKeys("Agaran@manju98");
	  Login.clickSignIn(w).click();
	  Login.clickYes(w).click();
	  
	  HomePage.search(w).sendKeys("time");
	  Thread.sleep(2000);
	  List<WebElement> l = w.findElements(By.xpath("//ul[@id = 'ui-id-1']/li"));
	  for(WebElement w1 : l)
	  {
		  if(w1.getText().equals("iTime (Time Sheet Management System)"))
		  {
			  w1.click();
		      break;
		  }
	  }
	  
		/*
		 * TimeSheet.getTime(w).sendKeys("9"); Actions a = new Actions(w);
		 * a.sendKeys(Keys.PAGE_DOWN).build().perform(); TimeSheet.clickSave(w).click();
		 */
  }
}
	  
	  

