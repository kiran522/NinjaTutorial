package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WEBdriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']]")).sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@name='password']]")).sendKeys("admin123");
      //driver.findElement(By.cssSelector("input.oxd-input[name='username']")).sendKeys("Admin");
//        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
//        driver.findElement(By.cssSelector(".oxd-button")).click();

//        driver.findElement(By.name("field-keywords")).sendKeys("T-shirt");
//        driver.findElement(By.id("nav-search-submit-button")).click();



        

        //  String Title = driver.getTitle();
      //System.out.println(Title);
//
//        if(Title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
//        {
//            System.out.println(" Test pass");
//        }
//        else
//        {
//            System.out.println("Test fail");
//        }

        driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bhubaneswar");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Cuttack");
        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.TAB);

        driver.findElement(By.xpath("//div[@id='onwardCal']")).click();

        WebElement month_year =driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]"));
        System.out.println(month_year.getText());
        String[] part = month_year.getText().split("\n");
        String FirstLine= part[0];
        String[] Month= FirstLine.split(" ");
        String year= Month[1];
        System.out.println(Month[0]); //month
        System.out.println(Month[1]); //year
        System.out.println(part[0]);

        WebElement click_btn = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]"));

     Actions act =new Actions(driver);



        while (true) {
            if (Month[0].equals("Jun") && Month[1].equals("2026")) {
                Thread.sleep(3000);
                month_year.click();
            } else {
               act.moveToElement(click_btn).click().build().perform();
                Thread.sleep(3000);
            }
        }





        }
    }
