package page.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import page.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {

    SelenideElement
            loginError = $(".Login-error"),
            headerMenu = $(".Header-left"),
            loginHeader = $(".Login-header");

    public HeaderComponent checkHeaderLogin(String login) {
        loginHeader.shouldHave(text(login));
        return this;
    }

    public HeaderComponent loginError(String errorText) {
        loginError.shouldHave(text(errorText));
        return this;
    }


    public HeaderComponent clickHeaderMenu(String value) {
        headerMenu.$(byText(value)).click();
        return this;
    }


}
