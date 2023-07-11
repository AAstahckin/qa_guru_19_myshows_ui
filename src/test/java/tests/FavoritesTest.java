package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.FavoritesPage;
import page.MainPage;

public class FavoritesTest extends TestBase {


    FavoritesPage favoritesPage = new FavoritesPage();
    MainPage mainPage = new MainPage();

    @Test
    @Tag("sanity")
    void positiveTest() {
        mainPage.openMyShows()
                .clickLoginHeader()
                .setLoginPassword("testqa_guru_2023@mail.ru", "testqa_guru_2023")
                .clickFavorites();
        favoritesPage.checkFavorites("Шерлок");


    }



}
