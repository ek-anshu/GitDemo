package javaSelenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a() {
		System.out.println("A Test Method");
	}
		@BeforeClass
	public void b() {
		System.out.println("B Test Method");
	}
	
	@Test
		public void a2() {
			System.out.println("  ");	
				
	}

}
