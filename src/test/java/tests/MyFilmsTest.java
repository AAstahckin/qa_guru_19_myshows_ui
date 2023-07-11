package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.MainPage;

public class MyFilmsTest extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Tag("sanity")
    void positiveTest() {
        mainPage.openMyShows()
                .clickLoginHeader()
                .setLoginPassword("testqa_guru_2023@mail.ru", "testqa_guru_2023")
                .clickMyFilms()
                .checkMyMovies("Начало");

    }


}
