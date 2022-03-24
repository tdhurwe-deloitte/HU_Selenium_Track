package MiniAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tdhurwe\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        WebElement sourceElement = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement destinationElement = driver.findElement(By.xpath("//p[text()='Drop here']"));
//        action.clickAndHold(sourceElement).moveToElement(destinationElement).release(destinationElement).build().perform();
        action.dragAndDrop(sourceElement,destinationElement).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
