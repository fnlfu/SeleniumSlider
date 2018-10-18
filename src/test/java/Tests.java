import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tests extends TestsMet{
    @Test
    public void testSlider() {
        driver.get("https://jqueryui.com/slider/#custom-handle");

        WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
        driver.switchTo().frame(frame);
        WebElement Sslider = driver.findElement(By.id("custom-handle"));

        int kek = 55;
        Sslider.click();
        if (Integer.parseInt(Sslider.getText())<kek)
            while (Integer.parseInt(Sslider.getText())!=kek){
                Sslider.sendKeys(Keys.ARROW_RIGHT);
            }
        else
            while (Integer.parseInt(Sslider.getText())!=kek){
                Sslider.sendKeys(Keys.ARROW_LEFT);
            }
    }
}
