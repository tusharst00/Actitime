package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/investor-relations");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("firstname")).sendKeys("tushar");
	driver.findElement(By.name("lastname")).sendKeys("Dhakate");
	driver.findElement(By.name("reg_email__")).sendKeys("895451551");
	Thread.sleep(5000);
	driver.close();

}
}