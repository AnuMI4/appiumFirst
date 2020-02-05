package calculatorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.remote.MobileCapabilityType;

public class FirstTest {

    WebDriver driver;

    @Test(priority = 0)
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test(priority = 1)
    public void select1(){
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"1\"]/android.widget.ImageView")).click();
    }
}
