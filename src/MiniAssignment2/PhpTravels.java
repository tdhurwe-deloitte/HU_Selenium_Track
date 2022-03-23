package MiniAssignment2;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PhpTravels {
//    public static void checkTitle(WebDriver driver)
//    {
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "PHPTRAVELS";
//        if(actualTitle.equals(expectedTitle)){
//            System.out.println("PASS");
//        }
//        else{
//            System.out.println("Fail");
//        }
//    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhurwe\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");
        String actualTitle = driver.getTitle();
        String expectedTitle = "PHPTRAVELS";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element = driver.findElement(By.linkText("Login"));
        element.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }

}
