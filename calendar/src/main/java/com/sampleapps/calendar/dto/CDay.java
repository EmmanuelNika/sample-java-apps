package com.sampleapps.calendar.dto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CDay {

    private LocalDate date;

    private String day;

    private String shortDate;

    private Integer dayOfMonth;

    private Integer dayOfYear;

    private Boolean isDisabled;

    private Boolean isWeekend;

    public LocalDate getDate() {

        return date;
    }

    public void setDate(LocalDate date) {

        this.date = date;
    }

    public String getDay() {

        return day;
    }

    public void setDay(String day) {

        this.day = day;
    }

    public Integer getDayOfMonth() {

        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {

        this.dayOfMonth = dayOfMonth;
    }

    public Integer getDayOfYear() {

        return dayOfYear;
    }

    public void setDayOfYear(Integer dayOfYear) {

        this.dayOfYear = dayOfYear;
    }

    public Boolean getDisabled() {

        return isDisabled;
    }

    public void setDisabled(Boolean disabled) {

        isDisabled = disabled;
    }

    public String getShortDate() {

        return shortDate;
    }

    public void setShortDate(String shortDate) {

        this.shortDate = shortDate;
    }

    public Boolean getWeekend() {

        return isWeekend;
    }

    public void setWeekend(Boolean weekend) {

        isWeekend = weekend;
    }

    public static CDay createDay(LocalDate date, Locale locale) {

        CDay cDay = new CDay();
        cDay.setDate(date);
        cDay.setDayOfMonth(date.getDayOfMonth());
        cDay.setDayOfYear(date.getDayOfYear());
        cDay.setShortDate(date.getDayOfWeek()
                .getDisplayName(TextStyle.SHORT, locale));
        cDay.setDay(date.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, locale));
        cDay.setDisabled(false);
        cDay.setWeekend(date.getDayOfWeek()
                .equals(DayOfWeek.SUNDAY) || date.getDayOfWeek()
                .equals(DayOfWeek.SATURDAY));

        return cDay;
    }

}
