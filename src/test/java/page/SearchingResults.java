package page;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$$;

public class SearchingResults {

    ElementsCollection
            resultList = $$("[data-tid=result]"),
            resultMoviesList = $$(".title__secondary");

    public SearchingResults checkSerialsListResults(String value){
        resultList.shouldHave(texts(value));
        return this;
    }

    public SearchingResults checkMoviesListResults(String value){
        resultMoviesList.get(1).click();
        resultList.shouldHave(texts(value));
        return this;
    }

}
