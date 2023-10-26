package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver s=new ChromeDriver();
		s.get("https://www.instagram.com/");
		s.manage().window().maximize();
		s.getCurrentUrl();
		String CSK = s.getCurrentUrl();
		System.out.println(CSK);
		
	}

}
