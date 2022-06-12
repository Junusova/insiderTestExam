package testMethod;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

import static page.CareersPage.*;
import static testMethod.BaseMethods.*;

public class QAJobsMethods {

    private  RemoteWebDriver driver;
    @Step
    public static void selectAndAssertQAJobs(){
        clickOnElement(acceptAllButton);
        clickOnElement(seeAllTeamsButton);
        clickOnElement(qAPositionLabel);
        clickOnElement(seeAllQAPositionLabel);
        clickOnElement(filterByLocationDropDown);
        clickOnElement(istanbulOptionValue);
        clickOnElement(applyNowButton);
        elementShouldHaveMatchText(istanbulTurkeyQAJobsList,"Management Trainee for Quality Assurance Quality Assurance");
    }

}
