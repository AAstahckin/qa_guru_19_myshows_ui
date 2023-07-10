package page.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class PopUpCookieComponent {

    SelenideElement
            agreeButtonCookie = $("[data-role=b_agree]"),
            agreeWindowCookie = $("[data-role=first_layer]"),
            homeSection = $(".Home-section .title__main");

    @Step("Принятие Cookie")
    public PopUpCookieComponent clickAgreeButton() {
        if(agreeWindowCookie.isDisplayed()) {
            agreeButtonCookie.shouldHave(visible, ofSeconds(5)).hover().click();
            homeSection.shouldHave(visible, ofSeconds(8));
        }
        return this;
    }
}
