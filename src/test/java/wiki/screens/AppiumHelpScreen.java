package wiki.screens;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;

import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static com.codeborne.selenide.appium.SelenideAppium.back;

public class AppiumHelpScreen {

    private final SelenideElement searchPageButton =
            $(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"org.wikipedia.alpha:id/navigation_bar_item_icon_container\").instance(2)"));

    private final SelenideElement searchInput =
            $(AppiumBy.id("org.wikipedia.alpha:id/search_text_view"));

    private final SelenideElement navigateUpButton =
            $(AppiumBy.accessibilityId("Navigate up"));

    private final SelenideElement searchAppiumResultField =
            $(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(2)"));

    private final SelenideElement appiumHeader =
            $(AppiumBy.androidUIAutomator("new UiSelector().text(\"Appium\")"));

    private final SelenideElement appiumHeaderDescription =
            $(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"pcs-edit-section-title-description\")"));

    private final SelenideElement appiumMainInfoTextBlock =
            $(AppiumBy.androidUIAutomator("new UiSelector().text(\" tool for running scripts and testing native applications, mobile-web applications and hybrid applications on \")"));

    private final SelenideElement appiumHistoryHeader =
            $(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"History\")"));

    private final SelenideElement editPageButton =
            $(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(16)"));

    private final SelenideElement appiumReferenceHeader =
            $(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"References\")"));

    private final SelenideElement appiumExternalLinkHeader =
            $(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"External_links\")"));

    private final SelenideElement appiumFooterAboutHeader =
            $(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"pcs-footer-container-menu-heading\")"));


    @Step("Переход на страницу Wiki по Appium")
    public AppiumHelpScreen moveToAppiumScreen() {
        searchPageButton.click();
        Selenide.sleep(1000);
        back();
        searchInput.click();

        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        driver.executeScript("mobile: type", Map.of("text", "Appium"));
        searchAppiumResultField.click();
        Selenide.sleep(1000);

        driver.executeScript("mobile: clickGesture", Map.of("x", 420, "y", 440));

        return this;
    }

    @Step("Проверка наличия кнопки возврата к блоку поиска")
    public AppiumHelpScreen checkNavigateUpButton() {
        navigateUpButton.shouldBe(visible);
        navigateUpButton.shouldBe(clickable);

        return this;
    }

    @Step("Проверка заголовка Appium")
    public AppiumHelpScreen checkAppiumHeader() {
        appiumHeader.shouldBe(visible);

        return this;
    }

    @Step("Проверка описания под заголовком Appium")
    public AppiumHelpScreen checkAppiumHeaderDescription() {
        appiumHeaderDescription.shouldBe(visible);

        return this;
    }

    @Step("Проверка краткой информации о странице Appium")
    public AppiumHelpScreen checkAppiumMainInfo() {
        appiumMainInfoTextBlock.shouldBe(visible);

        return this;
    }

    @Step("Проверка блока History на странице Appium")
    public AppiumHelpScreen checkAppiumHistoryHeader() {
        appiumHistoryHeader.shouldBe(visible);

        return this;
    }

    @Step("Проверка кнопки редактирования страницы")
    public AppiumHelpScreen checkEditPageButton() {
        editPageButton.shouldBe(visible);
        editPageButton.shouldBe(clickable);

        return this;
    }

    @Step("Проверка наличия блока Reference на странице Appium")
    public AppiumHelpScreen checkAppiumReferenceHeader() {
        appiumReferenceHeader.scrollTo().shouldBe(visible);

        return this;
    }

    @Step("Проверка наличия блока External Link на странице Appium")
    public AppiumHelpScreen checkAppiumExternalLinkHeader() {
        appiumExternalLinkHeader.scrollTo().shouldBe(visible);

        return this;
    }

    @Step("Проверка наличия блока Footer About в подвале страницы Appium")
    public AppiumHelpScreen checkAppiumFooterAboutHeader() {
        appiumFooterAboutHeader.scrollTo().shouldBe(visible);

        return this;
    }
}
