package util;

import java.io.File;

public class FileCreator {


    public static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }

    }
}
