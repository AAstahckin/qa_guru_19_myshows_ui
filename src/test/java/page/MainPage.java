package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

public class MainPage extends TestBase {

    SelenideElement
            loginHeader = $(".Login-header"),
            loginIcon = $(".Login-user .Icon"),
            loginInput = $(".login-form__login"),
            titleMain = $(".title__main"),
            searchInput = $(".Search-input"),
            selectedSidebar = $(".DefaultLayout-sidebar"),
            searchButton = $(".Search-submit"),
            searchResultsMovies = $(".search-results__movies"),
            searchResultsTitle = $(".search-results__title"),
            rowFavorites = $(".ShowCol-title"),
            headerTittle = $(".Container .title__main"),
            myMovies = $(".unwatched-movies__show-title_title"),
            passwordInput = $(".login-form__password");

    ElementsCollection titlesHome = $$(".Container .vue-horizontal .NewsItem__pic-wrapper");

    public MainPage openMyShows() {
        open("");
        popUpCookieComponent.clickAgreeButton();
        loginIcon.shouldHave(visible, ofSeconds(25));
        titlesHome.get(1).shouldHave(visible, ofSeconds(25));
        return this;
    }

    public MainPage setLoginPassword(String login, String password) {
        loginInput.setValue(login);
        passwordInput.setValue(password).pressEnter();
        return this;
    }


    public MainPage clickFavorites() {
        selectedSidebar.$(byText("Избранное")).hover().click();
        headerTittle.shouldHave(text("Избранное"), ofSeconds(15));
        return this;
    }

    public MainPage clickMyFilms() {
        selectedSidebar.$(byText("Мои фильмы")).hover().click();
        headerTittle.shouldHave(text("Мои фильмы"), ofSeconds(15));
        return this;
    }

    public MainPage checkFavorites(String value) {
        rowFavorites.shouldHave(text(value));
        return this;
    }

    public MainPage checkMyMovies(String value) {
        myMovies.shouldHave(text(value));
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
        searchButton.hover().click();
        return this;
    }

    public MainPage searchDropDownList(String value) {
        searchResultsTitle.shouldHave(visible, ofSeconds(25));
        searchResultsMovies.shouldHave(text(value));
        return this;
    }

}
