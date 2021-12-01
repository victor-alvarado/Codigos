package Case_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CP_PetClinic {

    public static void main(String[] args) {

        System.setProperty("webdriver.chorme.driver", "D:\\Selenium_petClinic\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:8080");

    }
}
