package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI
{
    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp()
    {
        //1.Launch Google Chrome
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/maish/Desktop/Demo/facebook/src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
