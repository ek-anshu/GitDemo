package javaSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotFailure2 {

	ScreenshotFaliure1 t1 = new ScreenshotFaliure1();

	@Test
	public void Login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Mission2024\\Mission2024\\Drivers\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		//t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.manage().window().maximize();
		t1.driver.navigate().to("https://demoqa.com/");
		// t1.driver.n
		t1.driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']']")).click();
		t1.driver.findElement(By.xpath("//img[@src='/images/Toolsq.jpg']']")).click();
		System.out.println("I am here"); 
		Thread.sleep(3000);	
		//t1.driver.quit();
	}	
	
	
	@AfterMethod
	public void TakesScreenshot(ITestResult result2) throws IOException {
		t1.capturescreenshot(result2);
		
	}
	
		

}
