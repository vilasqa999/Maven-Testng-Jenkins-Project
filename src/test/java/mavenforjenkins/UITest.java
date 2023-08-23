package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest 
{
	@Test	
	public void startBrowser() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.edgedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://visualstories.com/info/whitelabel");
		
		String expect="White Label AMP Web Stories Builder and Blogging Platform";
		String actual=driver.getTitle();
		Assert.assertEquals(actual,expect);
		
		System.out.println("Script executed successfully........");
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
