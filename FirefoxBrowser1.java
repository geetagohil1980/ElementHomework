package seleniumhomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser1 {
    public static void main(String[] args) {
         System.setProperty("webdriver.gecko.driver","C:\\software\\driver\\geckodriver.exe");//PATH METHOUD
        WebDriver driver=new FirefoxDriver(); // object creat
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();

    }
}
