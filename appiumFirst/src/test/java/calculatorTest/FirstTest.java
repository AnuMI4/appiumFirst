package calculatorTest;

import setup.setup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstTest extends setup {

    @Test(priority = 0)
    public void select1(){
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"1\"]/android.widget.ImageView")).click();
    }

}
