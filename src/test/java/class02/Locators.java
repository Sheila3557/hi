package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        //find the element email address and send email address to it
        WebElement email =driver.findElement(By.id("email"));
        //send text
        email.sendKeys("buttons123@gmail.com");

        //pass the password
        WebElement password=driver.findElement(By.name("pass"));
        //send text
        password.sendKeys("abracadabra");

        //find the button
        WebElement button=driver.findElement(By.name("login"));
        //click on button
        //button.click();

// go to fb.com and click on create new account
        //using link text
        //WebElement createAccount = driver.findElement(By.linkText("Create new account"));


        //using partial account
        WebElement createAccount = driver.findElement(By.partialLinkText("new account"));
    }
}
