package testMethod;

import io.qameta.allure.Step;

import static page.CareersPage.*;
import static testMethod.BaseMethods.elementShouldHaveMatchText;

public class CareersMethods {

    @Step
    public static void assertCareersPageBlocks(){
        elementShouldHaveMatchText(ourLocationsLabel,"Our Locations");
        elementShouldHaveMatchText(lifeAtInsiderLabel,"Life at Insider");
    }

}
