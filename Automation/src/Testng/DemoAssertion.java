package Testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
	@Test
	public void titleComparison()
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	
	

}
