package javaSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProg {

	public static void main(String[] args) {
		
		//made some changes to Check Git 
		System.setProperty("webdriver.chrome.driver", "D:\\Mission2024\\Mission2024\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/");		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[.='Elements']")).click();
		System.out.println("Git Demo Change");
		System.out.println("Git Demo Change2");
		//made by github guy
		System.out.println("Git Demo Change3");
		System.out.println("Git Demo Change4");
		System.out.println("Git Demo Change5");

	}

}
