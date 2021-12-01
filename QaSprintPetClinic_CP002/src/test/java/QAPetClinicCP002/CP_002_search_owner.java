package QAPetClinicCP002;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CP_002_search_owner {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");	
		
	}
	
	@Test
	public void searchOwner() {
		
		String typePet = "snake";
		
		WebElement findOwner = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
		findOwner.click();
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastName.sendKeys("McTavish");
		WebElement findOwner2 = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/button"));
		findOwner2.click();
		String tableRows = driver.findElement(By.xpath("/html/body/div/div/table[2]/tbody/tr/td[1]/dl/dd[3]")).getText();
		
		assertTrue(typePet.equals(tableRows));
		System.out.println("El caso Termino correctamente");
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}