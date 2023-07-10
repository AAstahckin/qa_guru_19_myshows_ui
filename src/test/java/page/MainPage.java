package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;

public class MainPage extends TestBase {

    SelenideElement
            loginHeader = $(".Login-header"),
            loginInput = $(".login-form__login"),
            homeSection = $(".Home-section .title__main"),
            titleMain = $(".title__main"),
            searchInput = $(".Search-input"),
            searchButton = $(".Search-submit"),
            searchResultsMovies = $(".search-results__movies"),
            searchResultsTitle = $(".search-results__title"),
            passwordInput = $(".login-form__password");

    public MainPage openMyShows() {
        open("");
        homeSection.shouldHave(visible, ofSeconds(8));

        popUpCookieComponent.clickAgreeButton();
        return this;
    }

    public MainPage setLoginPassword(String login, String password) {
        loginInput.setValue(login);
        passwordInput.setValue(password).pressEnter();
        return this;
    }

    public MainPage clickLoginHeader() {
        loginHeader.shouldHave(visible).hover().click();
        return this;
    }

    public MainPage checkTitle(String value) {
        titleMain.shouldHave(text(value));
        return this;
    }

    public MainPage searchInput(String value) {
        searchInput.click();
        searchInput.setValue(value);
        return this;
    }

    public MainPage searchButtonClick() {
        searchButton.click();
        return this;
    }

    public MainPage searchDropDownList(String value) {
        searchResultsTitle.shouldHave(visible, ofSeconds(8));
        searchResultsMovies.shouldHave(text(value));
        return this;
    }

}
