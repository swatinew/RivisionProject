package amazonPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SecondClass {
	public WebDriver driver;
	  @Test
	  public void flipkart() throws InterruptedException 
	  {
		  ChromeOptions ops = new ChromeOptions();
	      ops.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(ops);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			driver.close();
		  

}
}
