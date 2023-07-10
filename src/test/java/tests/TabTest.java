package tests;

import constants.TabsPages;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import page.MainPage;

public class TabTest extends TestBase {

    MainPage mainPage = new MainPage();

    @ParameterizedTest
    @EnumSource(value = TabsPages.class)
    void tabsTests(TabsPages tabsPages) {
        mainPage.openMyShows();
        headerComponent.clickHeaderMenu(tabsPages.getCategory());
        mainPage.checkTitle(tabsPages.getTittle());
    }

}
