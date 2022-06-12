package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static testMethod.CareersMethods.assertCareersPageBlocks;
import static testMethod.DashboardMethods.selectMoreThenOpenCareers;

public class TestCareersPage {

    @BeforeEach
    public void init(){
        open("https://useinsider.com/");
    }

    @Test
    public void assertCareersPageBlocksSuccessfully(){
        selectMoreThenOpenCareers();
        assertCareersPageBlocks();
    }
}
