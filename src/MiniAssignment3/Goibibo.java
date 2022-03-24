package MiniAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhurwe\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.goibibo.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Round-trip']")).click();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        
        driver.quit();
    }
}
