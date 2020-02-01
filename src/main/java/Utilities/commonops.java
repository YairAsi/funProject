package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class commonops extends base
{
    @BeforeClass
    public  void before()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        action = new Actions(driver);
        managePages.init();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 01 driver.get("http://juliemr.github.io/protractor-demo/");
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void after() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
