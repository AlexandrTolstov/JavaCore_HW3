public enum Holidays {
    NO_HOLIDAYS("Нет праздника"),
    NEW_YEAR("Новый год"),
    MARCH_8("8-е марта"),
    FEBRUARY_23("23-е февраля");

    final String russianTranslation;
    Holidays(String russianTranslation){
        this.russianTranslation = russianTranslation;
    }
}
