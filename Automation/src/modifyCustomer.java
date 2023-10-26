import org.testng.Reporter;
import org.testng.annotations.Test;

public class modifyCustomer {
	@Test
	public void create() {
		System.out.println("create customer");
		
	}
	@Test(invocationCount = 5)
	public void delete() {
		Reporter.log("deleted customer",true);
	}
	@Test
	public void modify() {
		Reporter.log("modified customer,true");
	}
}
