package MiniAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhurwe\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Test");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(text);
        if(text.equals("Test")){
            System.out.println("PASS");
        }
        else {
            System.out.println("Fail");
        }
        driver.quit();
    }
}
