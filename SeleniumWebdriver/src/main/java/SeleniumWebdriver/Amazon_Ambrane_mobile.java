package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Ambrane_mobile {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@id='name'])")).sendKeys("King");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@id='email'])")).sendKeys("King@gmail.com");
        driver.findElement(By.xpath("(//textarea[@id='textarea'])")).sendKeys("8181232345");


        driver.quit();
    }


}
