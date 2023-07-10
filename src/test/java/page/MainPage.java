package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends TestBase {

    SelenideElement
            loginHeader = $(".Login-header"),
            loginInput = $(".login-form__login"),
            homeSection = $(".Home-section .Grid-in"),
            titleMain = $(".title__main"),
            passwordInput = $(".login-form__password");

    public MainPage openMyShows() {
        open("");
        popUpCookieComponent.clickAgreeButton();
        homeSection.shouldHave(visible, Duration.ofSeconds(5));
        return this;
    }

    public MainPage setLoginPassword(String login, String password){
        loginInput.setValue(login);
        passwordInput.setValue(password).pressEnter();
        return this;
    }

    public MainPage clickLoginHeader(){
        loginHeader.shouldHave(Condition.visible).hover().click();
        return this;
    }

    public MainPage checkTitle(String value){
        titleMain.shouldHave(Condition.text(value));
        return this;
    }

}
