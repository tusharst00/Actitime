package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	static {System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pawan");
		Thread.sleep(5000);
		driver.close();
		
	}

}
