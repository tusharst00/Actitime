package qsp;

import org.openqa.selenium.chrome.ChromeDriver;


public class shadi {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			Thread.sleep(5000);
			driver.close();

		
	}
}
