package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static {
		System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		driver.findElement(By.name("otracker")).click();
		Thread.sleep(3000);
		String Text= driver.findElement(By.xpath("//div[text()='HP 14s Intel Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14s - dy2508TU Thin and Light Laptop']")).getText();
		System.out.println(Text);
		Thread.sleep(5000);
		driver.close();
		
	}

}
