package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Code for Config Page
 */
public class config {
    public static WebDriver driver;

    public static void init() {
        System.setProperty("webdriver.chrome.driver", "Dkatalis/../driver/chromedriver.exe");
        driver = new ChromeDriver();
        //Launch the application
        driver.get("https://demo.midtrans.com/");
    }
}
