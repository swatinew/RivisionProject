package amazonPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ThirdClass {
	public WebDriver driver;
	  @Test
	  public void myntra() throws InterruptedException 
	  {
		  ChromeOptions ops = new ChromeOptions();
	      ops.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(ops);
			driver.get("https://www.myntra.com/");
			Thread.sleep(3000);
			driver.close();
	  }
	}


