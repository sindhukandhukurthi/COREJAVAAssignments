package question4;

import java.util.*;
import java.text.SimpleDateFormat;

public class BirthDates {
    public static void main(String[] args) {
        LinkedList<Date> birthDates = new LinkedList<>();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            // Add date of birth objects to the LinkedList
            birthDates.add(dateFormat.parse("23-12-2004"));
            birthDates.add(dateFormat.parse("25-2-2001"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ListIterator<Date> iterator = birthDates.listIterator(birthDates.size());

        while (iterator.hasPrevious()) {
            Date dateOfBirth = iterator.previous();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateOfBirth);
            int year = calendar.get(Calendar.YEAR);
            String formattedDate = dateFormat.format(dateOfBirth);
            boolean isLeapYear = isLeapYear(year);

            String leapYearStatus = isLeapYear ? "was" : "was not";

            System.out.println("Your date of birth is " + formattedDate + " and it " + leapYearStatus + " a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}