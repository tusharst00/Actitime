import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleCompare {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void titlecomapare () {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedtitle = "Soogle";
		String actulaTitle = driver.getTitle();
		SoftAssert s= new SoftAssert ();
		s.assertEquals(actulaTitle, expectedtitle);
		
		driver.close();
		s.assertAll();
	}
}
