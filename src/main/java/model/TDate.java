package model;

import java.util.Scanner;

public class TDate {

    private String date;
    private String[] parsedDate;

    public TDate(String date)
    {
        this.date = date;
        parsedDate = parseDate(date);
    }

    public String getDate() {
        return date;
    }

    public Integer getMonth() {
        String month = parsedDate[0];

        return Integer.parseInt(month);
    }

    public Integer getDay() {
        String day = parsedDate[1];
        return Integer.parseInt(day);
    }

    public Integer getYear() {
        String year = parsedDate[2];
        return Integer.parseInt(year);
    }

    private String[] parseDate(String date) {
        Scanner sc = new Scanner(date);
        sc.useDelimiter("/");
        String[] dateInfo = new String[3];
        for (int i = 0; i < 3; i++) {
            dateInfo[i] = sc.next();
        }

        return dateInfo;
    }
}
