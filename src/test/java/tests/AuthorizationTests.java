package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import page.MainPage;
import page.components.HeaderComponent;
import java.util.stream.Stream;

import static constants.AuthorizationTextError.ERROR_LOGIN_OR_PASSWORD;
import static constants.AuthorizationTextError.ERROR_NOT_GOOD;

public class AuthorizationTests extends TestBase {

    MainPage mainPage = new MainPage();
    HeaderComponent headerComponent = new HeaderComponent();

    @Test
    @Tag("sanity")
    void positiveTest() {
        mainPage.openMyShows()
                .clickLoginHeader()
                .setLoginPassword("testqa_guru_2023@mail.ru", "testqa_guru_2023");
        headerComponent.checkHeaderLogin("testqa_guru");

    }

    @ParameterizedTest(name = "[user: {0}; pass: {1}]")
    @MethodSource("submitIncorrectParameters")
    void negativeTest(String login, String password, String errorText) {
        mainPage
                .openMyShows()
                .clickLoginHeader()
                .setLoginPassword(login, password);
        headerComponent.loginError(errorText);

    }

    private static Stream<Arguments> submitIncorrectParameters() {
        Faker faker = new Faker();
        return Stream.of(
                Arguments.of(faker.internet().emailAddress(), faker.artist().name(), ERROR_LOGIN_OR_PASSWORD.getErrorText()),
                Arguments.of("999999999", "999999999", ERROR_LOGIN_OR_PASSWORD.getErrorText()),
                Arguments.of("", "", ERROR_NOT_GOOD.getErrorText()),
                Arguments.of("*&%#*@@,()_*@@", "*&%#*@@,()_*@@", ERROR_LOGIN_OR_PASSWORD.getErrorText()));
    }

}
