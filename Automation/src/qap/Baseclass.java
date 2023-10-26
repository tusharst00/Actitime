package qap;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Baseclass {
	@Override
	public void onTestFailure (ITestResult result) {
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/"+name+".png");
				try {
					Files.copy(src, dest);
				} catch {
					//TODO Auto-generated catch block
					e.printStackTrace()
				}
	}

}
