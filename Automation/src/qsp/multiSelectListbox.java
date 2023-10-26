package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectListbox {
	static {

	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 WebElement element = driver.findElement(By.id("doremon"));
Select s = new Select(element);
s.selectByValue("br");
Thread.sleep(3000);
s.deselectByVisibleText("chicken lollipop");
Thread.sleep(3000);
s.selectByIndex(3);
Thread.sleep(30001);
s.selectByValue("Ip");
Thread.sleep(3000);
driver.close();
	
	
	

}
}