import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhurwe\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo");
        driver.quit();
    }
}
