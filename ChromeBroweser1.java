package seleniumhomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroweser1 {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();


    }
}
