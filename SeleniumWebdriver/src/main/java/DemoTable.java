import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

       List<WebElement> heaseCount= driver.findElements(By.xpath("//table[@id='productTable']//th"));

        List<WebElement> TagCount= driver.findElements(By.xpath("//table[@id='productTable']//td"));
        System.out.println(TagCount.size());
        WebElement tab= driver.findElement(By.xpath("//a[normalize-space()='1']"));

        for(int i= 1; i<5;i++) {
            driver.findElement(By.xpath("//a[normalize-space()='" + (i) + "']")).click();
        }
       for(WebElement headCounts : TagCount)
       {
           System.out.println(headCounts.getText());
           Thread.sleep(3000);
       }

//        for (int i = 0; i < heaseCount.size(); i++) {
//            System.out.println("Header " + i + ": " + heaseCount.get(i).getText());
//
//            // Click on pagination link if needed (ensure it exists)
//            try {
//                WebElement pageLink = driver.findElement(By.xpath("//a[normalize-space()='" + (i + 1) + "']"));
//                pageLink.click();
//            } catch (Exception e) {
//                System.out.println("No pagination link for index " + (i + 1));
//            }
//        }
//        Thread.sleep(3000);
//        for(int i= 1; i<5;i++)
//        driver.findElement(By.xpath("//a[normalize-space()='" + (i + 1) + "']")).click();

    }
}
