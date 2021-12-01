package QAPetClinicCP003;


import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP_003_add_visit {
	
	private WebDriver driver;
	
	@Before
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080");
	}
	
	@Test
	public void addVisit() {
		
		String textDescription = "Revision de rutina";
		
		WebElement findOwner = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
		findOwner.click();
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastName.sendKeys("Victor");
		WebElement findOwner2 = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/button"));
		findOwner2.click();
		WebElement addVisit = driver.findElement(By.xpath("/html/body/div/div/table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/a"));
		addVisit.click();
		WebElement addDescription = driver.findElement(By.xpath("//*[@id=\"description\"]"));
		addDescription.sendKeys(textDescription);
		WebElement addVisit2 = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/button"));
		addVisit2.click();
		String tableRows = driver.findElement(By.xpath("/html/body/div/div/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]")).getText();
		
		assertTrue(textDescription.equals(tableRows));
		System.out.println("El caso Termino con Exito");
			
		}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	

}
