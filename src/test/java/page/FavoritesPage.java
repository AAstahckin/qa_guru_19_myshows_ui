package page;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FavoritesPage extends TestBase {

    SelenideElement
            rowFavorites = $(".ShowCol-title");

    public FavoritesPage checkFavorites(String value) {
        rowFavorites.shouldHave(text(value));
        return this;
    }

}
