package seleniumhomework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementHomework {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.tagName("gender")).click();
        driver.findElement(By.id("FirstName")).sendKeys("geeta");
        driver.findElement(By.id("lastname")).sendKeys("rajput");

        WebElement day =driver.findElement(By.name("dateofbirth"));

        WebElement month =driver.findElement(By.name("dateofmonth"));

        WebElement year =driver.findElement(By.name("dateofyear"));

        driver.findElement(By.name("email")).sendKeys();
        driver.findElement(By.id("password")).sendKeys();

        driver.get("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/label");
        driver.findElement(By.id("register-button")).click();














    }
}
