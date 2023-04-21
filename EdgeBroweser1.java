package seleniumhomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBroweser1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\software\\driver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
