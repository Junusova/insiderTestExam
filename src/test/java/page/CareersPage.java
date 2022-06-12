package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CareersPage {

    public static SelenideElement ourLocationsLabel = $(byXpath("//div[@class='col-12 col-md-6']//h3")),
            ourLocationsValueLabel = $(byXpath("//div[@class='col-12 col-md-6']//p")),
            lifeAtInsiderLabel = $(byXpath("//div[@data-id='21cea83']")),
            seeAllTeamsButton = $(byXpath("//a[normalize-space()='See all teams']")),
            qAPositionLabel = $(byXpath("//a[normalize-space()='Quality Assurance']")),
            seeAllQAPositionLabel = $(byXpath("//a[normalize-space()='See all QA jobs']")),
            filterByLocationDropDown = $(byId("select2-filter-by-location-container")),
            istanbulOptionValue = $(byXpath("//li[normalize-space()='Istanbul, Turkey']")),
            istanbulTurkeyQAJobsList = $(byXpath("//div[@data-location='istanbul-turkey']")),
            acceptAllButton =  $(byXpath("//*[normalize-space()='Accept All']")),
            applyNowButton =  $(byXpath("//*[text()='Apply Now']"));



}
