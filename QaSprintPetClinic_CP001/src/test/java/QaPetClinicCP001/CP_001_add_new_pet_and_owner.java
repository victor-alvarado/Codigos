package QaPetClinicCP001;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.TestCase;

public class CP_001_add_new_pet_and_owner {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driverchrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");
	}
	
	@Test
	@TestCase(key = "ZPT-T1")
	public void testAddPetAndOwner() {
		WebElement findOwner = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
		findOwner.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement addOwner = driver.findElement(By.xpath("/html/body/div/div/a"));
		addOwner.click();
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstName.sendKeys("Alvarado");
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastName.sendKeys("Victor");
		WebElement address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
		address	.sendKeys("Calle Falsa 123");
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("springfield");
		WebElement telephone = driver.findElement(By.xpath("//*[@id=\"telephone\"]"));
		telephone.sendKeys("5566332210");
		WebElement addOwner2 = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/button"));
		addOwner2.click();
		WebElement addPet = driver.findElement(By.xpath("/html/body/div/div/a[2]"));
		addPet.click();
		WebElement petName = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		petName.sendKeys("Firulais");
		WebElement birthDate = driver.findElement(By.xpath("//*[@id=\"birthDate\"]"));
		birthDate.sendKeys("2019-12-13");
		Select pet = new Select (driver.findElement(By.name("type")));
		pet.selectByValue("dog");
		
		WebElement addPet2 = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/button"));
		addPet2.click();
		
		
		//String messageError = driver.findElement(By.xpath("/html/body/div/div/form/div[1]/div[5]/div/span[2]")).getText();
		
		//System.out.println(messageError);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
