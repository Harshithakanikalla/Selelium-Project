package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Logindata {
    public static void main(String[] args) {
        String ChromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://www.hackerrank.com/auth/login");
        //driver.findElement(By.linkText("Login in")).click();
        //driver.findElement(By.xpath("//input[@id='input-3' and @class='input']")).sendKeys("honeysri");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("harshitah566@sasi.ac.in");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Harshi@1578");
        //driver.findElement(By.xpath("//input[@name='tos_accepted']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
