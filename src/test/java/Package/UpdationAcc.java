package Package;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UpdationAcc {
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws IOException, ParseException {
        WebDriverManager.chromedriver().setup();
        String chromeDriverPath = "C:\\software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", chromeDriverPath);
        String LoginDataPath = "src/main/resources/LoginData.json";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        FileReader fr = new FileReader(LoginDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        String url = (String) jsonObject.get("url");
        System.out.println(url);
        driver.get(url);

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("I am in teardown method");
        driver.quit();

    }
    @Test
    public void updateUser() throws IOException, ParseException {


        String searchCompDataPath = "src/main/resources/ValidLogin.json";
        FileReader fr = new FileReader(searchCompDataPath);
        JSONParser Parser = new JSONParser();
        Object ob = Parser.parse(fr);
        JSONObject jsonObject = (JSONObject) ob;
        JSONObject tc = (JSONObject) jsonObject.get("tc01");
        String Username = (String) tc.get("Username");
        String password = (String) tc.get("password");
        String expMsg = "Valid";
        System.out.println(expMsg + " " + Username + " " + password);
        HomePage h = new HomePage(driver);
        h.setSearchText(Username);
        h.setSearchText1(password);
        h.clickSearchButton();
        h.clickProfile();
        h.clickSetting();
        h.clickPassword();
        h.clickCurrentPassword();
        h.clickChangePassword();
        h.clickNewPassword();
        h.clickConformNewPassword();
    }


}
