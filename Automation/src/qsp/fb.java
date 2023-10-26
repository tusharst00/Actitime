package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver s=new ChromeDriver();
		s.manage().window().maximize();
		s.get("https://www.facebook.com/");
		String j = s.getPageSource();
		System.out.println(j);
		Thread.sleep(5000);
		s.close(); 
		
	}

}
