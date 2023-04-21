package seleniumhomework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBroweser2 {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver(); // object creat
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("gitgohil@yahoo.co.in");
        driver.findElement(By.id("Password")).sendKeys("ss12345678");





    }
}
