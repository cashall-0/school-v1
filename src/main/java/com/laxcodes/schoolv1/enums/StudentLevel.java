package com.laxcodes.schoolv1.enums;

public enum StudentLevel {
    YEAR_ONE("100 level"), YEAR_TWO("200 level"), YEAR_THREE("300 level"), YEAR_FOUR("400 level"), YEAR_FIVE("500 level"), YEAR_SIX("600 level"), YEAR_SEVEN("700 level");

    private final String value;
    private StudentLevel(String value){
        this.value = value;
    }
    public String getValue() {
        return  value;
    }
}
