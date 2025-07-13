package TutorialNinja.Register;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;
import java.util.Date;

public class Testcase1  {
    @Test
    public  void VerifyingRegistration() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Santosh");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sahoo");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(DynamicName());
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9998887770");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Santosh@123");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Santosh@123");

        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//label[normalize-space()='No']")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

       String actualText = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();

        Assert.assertEquals(actualText, "Your Account Has Been Created!");





    }
    public  String DynamicName(){

            Date date= new Date();
            String DynamicName = date.toString().replaceAll(" ","").replaceAll(":","")+"@gmail.com";
            return DynamicName ;

    }
}
