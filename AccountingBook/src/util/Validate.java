package util;

public class Validate {
    public String[] validateQuantity(String line) {
        String[] parts = line.split(" ");
        if (parts.length != 6){
            System.err.println("Inserted invalid quantity of data");
            throw new IllegalArgumentException();
        }
        return parts;
    }
}
