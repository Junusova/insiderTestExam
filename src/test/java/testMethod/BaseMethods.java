package testMethod;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;

public class BaseMethods {

    @Step
    public static void clickOnElement(SelenideElement element) {
        element.shouldBe(visible).shouldBe(enabled).click();
    }

    @Step
    public static void sendKeysToElement(SelenideElement element, String text) {
        element.setValue(text);
    }

    @Step
    public static void elementShouldHaveValue(SelenideElement element, String text) {
        element.shouldHave(value(text));
    }

    @Step
    public static void elementShouldHaveText(SelenideElement element, String text) {
        element.shouldHave(text(text));
    }

    @Step
    public static void elementShouldNotHaveText(SelenideElement element, String text) {
        element.shouldNotHave(text(text));
    }


    @Step
    public static void elementShouldHaveMatchText(SelenideElement element, String text) {
        element.shouldHave(matchText(text));
    }

    @Step
    public static void elementShouldBeVisible(SelenideElement element) {
        element.shouldBe(visible);
    }

    @Step
    public static void elementShouldNotBeVisible(SelenideElement element) {
        element.shouldNotBe(visible);
    }

    @Step
    public static void elementShouldNotBeExist(SelenideElement element) {
        element.shouldNotBe(exist);
    }

    @Step
    public static void elementShouldBeExist(SelenideElement element) {
        element.shouldBe(exist);
    }

    @Step
    public static void elementShouldBeDisabled(SelenideElement element) {
        element.shouldBe(disabled);
    }

    @Step
    public static void waitElementVisible(SelenideElement element)  {
        element.shouldBe(visible);
    }

    @Step
    public static void waitElementForVisible(SelenideElement element) {
        element.shouldBe(visible, Duration.ofMillis(40000));
    }

    @Step
    public static void listShouldHaveTexts(ElementsCollection collection, String... listTexts) {
        collection.shouldHave(texts(listTexts));
    }

    @Step
    public static void selectCheckbox(SelenideElement element) {
        element.setSelected(true);
    }

    @Step
    public static void unselectCheckbox(SelenideElement element) {
        element.setSelected(false);
    }

}