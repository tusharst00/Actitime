package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tinder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tinder.com/");
		Thread.sleep(5000);
		driver.close();
	}

}
