package Model.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Model.User;

public class UserRepo {

    private File file;

    public UserRepo(File file) {
        this.file = file;
    }
    public void save(List<String> data) throws RuntimeException {

        try (FileWriter writer = new FileWriter(file,true)) {
            for (String line : data) {
                writer.write(line);
                writer.append('\n');
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String toInput(User user) {
        return String.format("%s,%s,%s,%s,%s,%s",user.getSurname(), user.getName(),
                user.getLastName(), user.getBirthDate(),
                user.getPhoneNumber(), user.getSex());
    }

    public void write(User user) {
        List<String> lines = new ArrayList<>();

        lines.add(toInput(user));

        save(lines);
    }


}
