package page;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$$;

public class SearchingResultsPage {

    ElementsCollection
            resultList = $$("[data-tid=result]"),
            resultMoviesList = $$(".title__secondary");

    public SearchingResultsPage checkSerialsListResults(String value){
        resultList.shouldHave(texts(value));
        return this;
    }

    public SearchingResultsPage checkMoviesListResults(String value){
        resultMoviesList.get(1).click();
        resultList.shouldHave(texts(value));
        return this;
    }

}
