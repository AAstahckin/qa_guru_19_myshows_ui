package constants;

public enum TabsPages {

    SERIALS("Сериалы", "Каталог сериалов"),
    MOVIES("Фильмы", "Каталог фильмов"),
    NEWS("Новости", "Новости сериалов"),
    COMMUNITY("Сообщество", "Сообщество"),
    RATINGS("Рейтинги", "Рейтинги и премии");

    private String tabs;
    private String tittle;

    TabsPages(String tabs, String tittle) {
        this.tabs = tabs;
        this.tittle = tittle;
    }

    public String getCategory() {
        return tabs;
    }

    public String getTittle() {
        return tittle;
    }

}
