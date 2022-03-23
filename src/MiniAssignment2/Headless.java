package MiniAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhurwe\\Downloads\\chromedriver.exe");
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");
        String actualTitle = driver.getTitle();
        String expectedTitle = "PHPTRAVELS";
        String parentWindow = driver.getWindowHandle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        String secondTitle = driver.getTitle();
        if(expectedTitle.equals(secondTitle)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        driver.switchTo().window(parentWindow);

        driver.findElement(By.xpath("//a[text()='Pricing']")).click();

        driver.navigate().back();
        driver.navigate().refresh();
    }
}
