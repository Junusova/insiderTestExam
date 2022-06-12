package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    public static SelenideElement moreDropDownToggle = $(byXpath("//*[@id=\"mega-menu-1\"][normalize-space()='More']")),
    careersLink = $(byXpath("//h5[normalize-space()='Careers']")),
    dashboardUpBottomLinks = $(byXpath("//*[@id=\"mega-menu-1\"]"));

}
