package page.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {

    SelenideElement
            loginError = $(".Login-error"),
            loginHeader = $(".Login-header");

    @Step("Проверяем пользователя в header")
    public HeaderComponent checkHeaderLogin(String login) {
        loginHeader.shouldHave(text(login));
        return this;
    }

    @Step("Проверяем ошибку авторизации")
    public HeaderComponent loginError(String errorText) {
        loginError.shouldHave(text(errorText));
        return this;
    }

}
