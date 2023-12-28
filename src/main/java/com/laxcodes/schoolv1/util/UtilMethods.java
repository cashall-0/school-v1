package com.laxcodes.schoolv1.util;

import java.util.Calendar;
public class UtilMethods {
    //utility methods for the whole application
    public static long count = 1;
    public static int year = Calendar.getInstance().get(Calendar.YEAR);
    public static String createRegNo(){
        String y = String.valueOf(year);
        String mm = "";
        if (count < 10){
            mm = "00000";
        } else if (count < 100) {
            mm = "0000";
        } else if (count < 1000) {
            mm = "000";
        } else if (count < 10000) {
            mm = "00";
        } else if (count < 100000) {
            mm = "0";
        }
        String regNumber = y + mm + count;
        count +=1;
        return regNumber;
    }
}
