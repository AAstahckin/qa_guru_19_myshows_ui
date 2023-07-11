package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import page.MainPage;
import page.SearchingResultsPage;

public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchingResultsPage searchingResultsPage = new SearchingResultsPage();

    @ParameterizedTest(name = "[{0}]")
    @ValueSource(strings = {
            "Рик и морти", "Крепкий орешек", "Шерлок", "Ходячие мертвецы",
            "Игра престолов", "Ведьмак", "Симпсоны"
    })
    void searchSerialsTest(String value) {
        mainPage.openMyShows().searchInput(value).searchButtonClick();
        searchingResultsPage.checkSerialsListResults(value);
    }

    @ParameterizedTest(name = "[{0}]")
    @ValueSource(strings = {
            "Симпсоны в кино", "Крепкий орешек", "Мстители", "Первый мститель",
            "Токийские мстители", "Мстители: Война бесконечности", "Мира"
    })
    void searchMoviesTest(String value) {
        mainPage.openMyShows().searchInput(value).searchButtonClick();
        searchingResultsPage.checkMoviesListResults(value);
    }

}
