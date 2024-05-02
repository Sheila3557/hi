package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
// instance of chromeDriver
            WebDriver driver =new ChromeDriver();

//        open the chrome browser
            driver.get("https://www.facebook.com/");//navigate to a url

        //maximize the window
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        //get the title of the webPage
        String title = driver.getTitle();
        System.out.println("the title of the webpage is "+title);

        //just for observation but not a good practice delete after that
        Thread.sleep(4000);

        driver.quit();

        }
    }

