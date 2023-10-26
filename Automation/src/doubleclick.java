import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.bbc.com/");
JavascriptExecutor j = (JavascriptExecutor) driver;
Thread.sleep(5000);
WebElement src = driver.findElement(By.xpath("//h1[.='Block 1']"));
WebElement dest = driver.findElement(By.xpath("//h1[.='Block 4']"));
Actions a=new Actions(driver);
Thread.sleep(5000);
driver.close();
}
}
