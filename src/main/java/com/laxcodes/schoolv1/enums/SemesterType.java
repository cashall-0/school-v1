package com.laxcodes.schoolv1.enums;

public enum SemesterType {
    RAIN_SEMESTER("1st Semester"),HARMATTAN_SEMESTER("2nd semester");
    private final String value;
    private SemesterType(String value){
        this.value = value;
    }
    public String getValue() {
        return  value;
    }
}
