package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.expandtesting.com/tables");

        Thread.sleep(3000);

        List<WebElement> names =driver.findElements(By.xpath("//table[@id='table1']//td"));

        for(WebElement name : names)
        {
            System.out.println(name.getText());
        }
        System.out.print("");


        driver.quit();
    }


}
