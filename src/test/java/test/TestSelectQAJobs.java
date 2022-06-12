package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static testMethod.DashboardMethods.selectMoreThenOpenCareers;
import static testMethod.QAJobsMethods.selectAndAssertQAJobs;

public class TestSelectQAJobs {

    @BeforeEach
    public void init(){
        open("https://useinsider.com/");
    }

    @Test
    public void test01(){
        selectMoreThenOpenCareers();
        selectAndAssertQAJobs();
    }
}
