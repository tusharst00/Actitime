package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytextfunction {
	static {
		System.setProperty("Webdriver.chorme.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement()
	
}
}
