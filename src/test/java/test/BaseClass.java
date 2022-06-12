package test;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import utils.RemoteDriver;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public abstract class BaseClass {

    private static final ThreadLocal<Process> process = new ThreadLocal<>();

    public BaseClass() {
        WebDriverRunner.setWebDriver(new RemoteDriver().createDriver());
    }

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void tearDown() {
        clearBrowserCookies();
        closeWebDriver();
    }
}

