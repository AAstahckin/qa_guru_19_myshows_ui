package page.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class PopUpCookieComponent {

    SelenideElement
            agreeButtonCookie = $("[data-role=b_agree]"),
            agreeWindowCookie = $("[data-role=first_layer]");

    @Step("Принятие Cookie")
    public PopUpCookieComponent clickAgreeButton() {
        if(agreeWindowCookie.isDisplayed()) {
            agreeButtonCookie.shouldHave(visible, ofSeconds(25)).hover().click();
        }
        return this;
    }
}
