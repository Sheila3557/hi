package HW;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;



public class Task2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://synatxprojects.com/input-form-locator.php");

        WebElement firstname = driver.findElement(By.name("first_name"));
        firstname.sendKeys("Sheila");
        WebElement lastname = driver.findElement(By.name("last_name"));
        lastname.sendKeys("Novales");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("gamersthumb721@gmail.com");

        WebElement submit = driver.findElement(By.id("submit_button"));
        submit.click();
        WebElement clickhere = driver.findElement(By.linkText("Click Here"));
        clickhere.click();
        WebElement links = driver.findElement(By.linkText("Link"));
        links.click();

    }
}
