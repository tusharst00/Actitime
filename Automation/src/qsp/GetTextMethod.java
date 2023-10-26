package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
 static {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 
 }
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	String Text= driver.findElement(By.xpath("//span[text()='TORRAS Magnetic Guardian Designed for iPhone 14 Pro Max Case [Military Grade Drop Tested] [Compatible with MagSafe] Slim Translucent Matte Case for iPhone 14 Pro Max Phone Case (6.7\"), Mystic Black']")).getText();
	System.out.println(Text);
	Thread.sleep(3000);
	driver.close();   
	
}
}
