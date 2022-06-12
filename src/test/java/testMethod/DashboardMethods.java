package testMethod;

import io.qameta.allure.Step;

import static page.DashboardPage.*;
import static testMethod.BaseMethods.clickOnElement;
import static testMethod.BaseMethods.elementShouldHaveMatchText;

public class DashboardMethods {

    @Step
    public static void selectMoreThenOpenCareers(){
        clickOnElement(moreDropDownToggle);
        clickOnElement(careersLink);
    }

    @Step
    public static void assertDashboardDepartmentsBlockElements(){
       elementShouldHaveMatchText(dashboardUpBottomLinks, "Platform");
       elementShouldHaveMatchText(moreDropDownToggle, "More");
    }

}
