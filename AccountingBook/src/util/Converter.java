package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Converter {

    public LocalDate convertToLocalDate(String date) throws IllegalArgumentException {
        LocalDate birthdate = null;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            birthdate = LocalDate.parse(date,dateTimeFormatter);
        } catch (DateTimeParseException e) {
            System.err.println("Unable to parse the date!");
            throw new IllegalArgumentException();
        }
        return birthdate;
    }

    public Long convertToLong(String part) throws IllegalArgumentException {
        Long phone = null;
        try {
            phone = Long.valueOf(part);
        } catch (IllegalArgumentException e) {
            System.err.println("Must be a number");
            throw e;
        }
        return phone;
    }

    public char convertToChar(String part) throws IllegalArgumentException {
        Character ch = null;
        try {
            ch = part.charAt(0);
            if (ch != 'm' && ch != 'f') {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Character for sex must be 'f' or 'm'");
            throw e;
        }
        return ch;
    }
}
