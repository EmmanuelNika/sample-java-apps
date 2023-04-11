package com.sampleapps.calendar.views;

import com.sampleapps.calendar.dto.CMonth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class HolidayView {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_GREEN = "\u001B[32m";

    private static final Logger LOGGER = Logger.getLogger(HolidayView.class.getName());

    private static final String OUTPUT_FORMAT = "%10s";

    private HolidayView() {}

    public static void holidayMenu(Scanner menuInput) {

        String holidayView = """
                                                    
                          Select Holiday Rule
                          1. The holiday falls on the same month and date each year.
                          2. If the actual holiday falls on a Saturday, provide a day off on the preceding Friday; if the holiday falls on a Sunday, then provide a day off on the Monday after the holiday.
                                                 
                          """;

        System.out.println(holidayView);

        int holidayOption = menuInput.nextInt();

        MenuView.displayHomeMenu(menuInput);

    }

    private static LocalDate stringToLocalDate(String datetime) {

        final String DATE_FORMATS = "[yyyy-MM-dd][dd/MM/yyyy]";

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATS);

            return LocalDate.parse(datetime, formatter);

        } catch (Exception e) {
            LOGGER.severe(String.format("Error formatting date! %s", e.getLocalizedMessage()));
        }

        return null;

    }

}