import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestsMet {

    WebDriver driver;

    @DataProvider(name = "SliderData")
    public static Object[][] SliderData() {
        return new Object[][]{{80}, {50}, {55}, {55}};
    }


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        System.setProperty("webdriver.firefox.marionette", "src/test/dricers/geckodriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void SliderMove(WebElement slider, int i) {
        if (Integer.parseInt(slider.getText()) < i)
            while (Integer.parseInt(slider.getText()) != i) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
        else
            while (Integer.parseInt(slider.getText()) != i) {
                slider.sendKeys(Keys.ARROW_LEFT);
            }
    }
}
