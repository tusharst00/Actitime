package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALLsuggestion {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("iphone 14");
Thread.sleep(3000);
  List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']")); 
  Thread.sleep(5000);
int qsp = allsugg.size();
System.out.println(qsp);
for(int i=0;i<qsp;i++) {
	String sug = allsugg.get(i).getText();
	System.out.println(sug);
}
Thread.sleep(3000);
driver.close();
}
}