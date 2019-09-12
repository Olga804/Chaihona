package steps;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {

    private static WebDriver driver;
    private static String baseUrl;
    private static Properties properties = TestProperties.getINSTANCE().getProperties();

    @BeforeClass
    public static void setUp(){
    driver = new ChromeDriver();
    baseUrl = properties.getProperty("app.url");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.setProperties("webdriver.chrome.driver","drv/chromedriver.exe");
    }


    @After
    public static void tearDown() throws Exception {
        if (driver!=null) {
            driver.quit();
            driver=null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
