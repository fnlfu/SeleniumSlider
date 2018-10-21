import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends TestsMet {
    @Test(dataProvider = "SliderData")
    public void testSlider(int where) {
        driver.get("https://jqueryui.com/slider/#custom-handle");

        WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
        driver.switchTo().frame(frame);
        WebElement slider = driver.findElement(By.id("custom-handle"));

        SliderMove(slider, where);
        Assert.assertEquals(Integer.parseInt(slider.getText()), where);

    }

    @Test(parameters = "SliderDataAll")
    public void testSliderAll() {
    }
}
