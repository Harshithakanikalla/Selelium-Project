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

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class VerifyValid {

    WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws IOException, org.json.simple.parser.ParseException {
        String url="https://www.hackerrank.com/auth/login";
        WebDriverManager.chromedriver().setup();


        String chromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", chromeDriverPath);
        String LoginDataPath = "src/main/resources/LoginData.json";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
      /*  FileReader fr = new FileReader(LoginDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        String url = (String) jsonObject.get("url");
        System.out.println(url);*/
        driver.get(url);
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void searchCriteria() throws IOException, ParseException, InterruptedException {


        String searchCompDataPath = "src/main/resources/TestCases.json";
        FileReader fr = new FileReader(searchCompDataPath);
        JSONParser Parser = new JSONParser();
        Object ob = Parser.parse(fr);
        JSONObject jsonObject = (JSONObject) ob;
        JSONObject tc = (JSONObject) jsonObject.get("tc05");


        String Username = (String) tc.get("found");
        String password = (String) tc.get("pass");
        String expMsg = "Valid";
        System.out.println(expMsg + " " + Username + " " + password);
        HomePage h = new HomePage(driver);
        h.setSearchText(Username);
        h.setSearchText1(password);
        h.clickSearchButton();
        // Thread.sleep(2000);
        //h.setSearch("fiction");
        //h.clickSearch();
        //Thread.sleep(2000);
    }

}
