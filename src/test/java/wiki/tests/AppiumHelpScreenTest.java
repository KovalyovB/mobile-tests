package wiki.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import wiki.screens.AppiumHelpScreen;
import wiki.screens.OnboardingScreen;

import static io.qameta.allure.Allure.step;

@DisplayName("Тесты страницы Wiki - Appium")
public class AppiumHelpScreenTest extends TestBase {

    @Test
    @DisplayName("Тест наличия всех обязательных кнопок/полей на странице Appium")
    public void appiumHelpScreenTest() {
        OnboardingScreen onboarding = new OnboardingScreen();
        AppiumHelpScreen appiumHelpScreen = new AppiumHelpScreen();

        step("Проверить все 4 экрана онбординга и пропустить его", () -> {
            onboarding
                    .checkKnowledgeScreen()
                    .clickForward()
                    .checkDataPrivacyScreen()
                    .clickForward()
                    .checkLanguagesScreen()
                    .clickForward()
                    .checkCuriosityScreen()
                    .clickSkip()
                    .checkOpened();
        });

        appiumHelpScreen
                .moveToAppiumScreen()
                .checkNavigateUpButton()
                .checkAppiumHeader()
                .checkAppiumHeaderDescription()
                .checkAppiumMainInfo()
                .checkAppiumHistoryHeader()
                .checkEditPageButton()
                .checkAppiumReferenceHeader()
                .checkAppiumExternalLinkHeader()
                .checkAppiumFooterAboutHeader();
    }
}
