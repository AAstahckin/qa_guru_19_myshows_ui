package tests;

import datatest.TabsPagesData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import page.MainPage;

public class TabTest extends TestBase {

    MainPage mainPage = new MainPage();

    @ParameterizedTest
    @EnumSource(value = TabsPagesData.class)
    void tabsTests(TabsPagesData tabsPages) {
        mainPage.openMyShows();
        headerComponent.clickHeaderMenu(tabsPages.getCategory());
        mainPage.checkTitle(tabsPages.getTittle());
    }

}
