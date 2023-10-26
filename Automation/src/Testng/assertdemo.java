package Testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertdemo {
	@Test
	public void titleComparison() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	String expectedtitle = "Google";
	String actualtitle = driver.getTitle();
	Assert.assertNotEquals(expectedtitle, actualtitle);
	Thread.sleep(5000);
	driver.close();

}
}