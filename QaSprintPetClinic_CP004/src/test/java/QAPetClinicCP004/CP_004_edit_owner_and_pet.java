package QAPetClinicCP004;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP_004_edit_owner_and_pet {
	
private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");
	}
	
	@Test
	public void editPet() {
		
	}
	
	@Test
	public void editOwner() {
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
