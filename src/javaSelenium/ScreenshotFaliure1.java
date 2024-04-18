package javaSelenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenshotFaliure1 {

	WebDriver driver;

	public void capturescreenshot(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile,new File("./Screenshots/" + result.getName() + ".png") );
			System.out.println(result.getName() + " method()screenshot ");
		}

	}

}
