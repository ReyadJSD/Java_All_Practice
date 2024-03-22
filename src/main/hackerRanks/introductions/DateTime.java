package main.hackerRanks.introductions;

import java.util.Calendar;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        in.close();

        // Print the day of the week
        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        // Get the day of the week in capital letters
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int dayOfWeekIndex = cal.get(Calendar.DAY_OF_WEEK) - 1;

        return daysOfWeek[dayOfWeekIndex];
    }
}
