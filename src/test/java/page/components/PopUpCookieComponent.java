package page.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class PopUpCookieComponent {

    SelenideElement
            agreeButton = $("[data-role=b_agree]"),
            homeSection = $(".Home-section .title__main");

    @Step("Принятие Cookie")
    public PopUpCookieComponent clickAgreeButton() {
        if(agreeButton.isDisplayed()) {
            agreeButton.shouldHave(visible, ofSeconds(5)).click();
            homeSection.shouldHave(visible, ofSeconds(8));
        }
        return this;
    }
}
