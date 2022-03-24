package MiniAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhurwe\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
        Thread.sleep(4000);
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        String text = driver.findElement(By.tagName("body")).getText();
//        String text = driver.getTitle();
        System.out.println(text);
        driver.quit();
    }
}
