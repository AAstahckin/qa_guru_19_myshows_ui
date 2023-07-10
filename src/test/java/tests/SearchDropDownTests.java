package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import page.MainPage;

public class SearchDropDownTests extends TestBase {

    MainPage mainPage = new MainPage();
    @Tag("sanity")
    @ParameterizedTest(name = "[{0}]")
    @ValueSource(strings = {
            "Первый мститель", "Симпсоны в кино", "Мира", "Первый мститель",
            "Мстители: Война бесконечности", "Интерстеллар", "Форд против Феррари"
    })
    void positiveTest(String value) {
        mainPage.openMyShows()
                .searchInput(value)
                .searchDropDownList(value);

    }

}
