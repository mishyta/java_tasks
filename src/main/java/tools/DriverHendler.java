package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverHendler {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "/home/mknysh/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://demos.dojotoolkit.org/demos/clock/demo.html");
        return driver;
    }
}
