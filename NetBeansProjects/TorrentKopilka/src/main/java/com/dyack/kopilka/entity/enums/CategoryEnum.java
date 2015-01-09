package com.dyack.kopilka.entity.enums;

public enum CategoryEnum {

    HUD,
    DOC,
    MULT,
    SERIAL,
    TV;

    CategoryEnum() {
    }

    private static class enums {

        public static final String HUD = "Художественный фильм";
        public static final String DOC = "Документальный фильм";
        public static final String MULT = "Мультфильм";
        public static final String SERIAL = "Сериал";
        public static final String TV = "ТВ";

    }

}
