package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static testMethod.DashboardMethods.assertDashboardDepartmentsBlockElements;

public class TestOpenMainPage {


    @BeforeEach
    public void init(){
        open("https://useinsider.com/");
    }

    @Test
    public void openMainPageThenCheckThatItWasSuccessfully(){
        assertDashboardDepartmentsBlockElements();
    }
}
