package page.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PopUpCookieComponent {

    SelenideElement
            agreeButton = $("[data-role=b_agree]");

    @Step("Принятие Cookie")
    public PopUpCookieComponent clickAgreeButton() {
        if(agreeButton.isDisplayed()) {
            agreeButton.shouldHave(visible, Duration.ofSeconds(5)).click();
        }
        return this;
    }
}
