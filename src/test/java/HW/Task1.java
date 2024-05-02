package HW;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class Task1 {
    public static void main(String[] args)throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Charlie");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Novales");

        WebElement email = driver.findElement(By.name("reg_email_"));
        email.sendKeys("char.nov24@gmail.com");

        WebElement password =driver.findElement(By.name("reg_password_"));
        password.sendKeys("chaseButtons123");
    }
}
