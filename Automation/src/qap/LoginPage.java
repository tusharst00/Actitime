package qap;

import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div{.='Login ']")
	private WebElement lgbtn;
	
	//initialization
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
