import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class Annotations {
	@BeforeSuite
	Public class Annotations{
		Reporter.log("database connected",true);
	}
 @BeforeTest
 Public void launchBrowser() {
	 Reporter.log("browser is launched",true);
 }
 @Test
 Public void createCustomer() {
	 Reporter.log("customer created successfully);
 }
 @AfterMethod
 Public void logout() {
	 Reporter.log("logout successfully",true)
 }
}
