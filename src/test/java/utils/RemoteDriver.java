package utils;

import com.codeborne.selenide.WebDriverProvider;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class RemoteDriver  {

    private RemoteWebDriver driver;

    public WebDriver createDriver() {
     //   SelenoidSshConnection.getInstance().establish();
        try {
            driver = new RemoteWebDriver(
                    URI.create("http://selenoid:4444/wd/hub").toURL(),
                    getCapabilities());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().window().setSize(new Dimension(2000, 1300));
        return driver;
    }

    private DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
       // capabilities.setBrowserName("firefox");
        capabilities.setVersion("98.0");
        capabilities.setCapability("acceptInsecureCerts", true);
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        capabilities.setCapability("console", true);
        capabilities.setCapability("network", true);
        return capabilities;
    }
}