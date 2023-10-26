package qap;

import org.openqa.selenium.support.PageFactory;

public class HomePage {
//declaration
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskink;
	
	@FindBy(xpath = "//div[.='Reports']")
	private Webelement reportsink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userink;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutink;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
}
