package Controller;

import Model.Repository.UserRepo;
import Model.User;
import util.Converter;
import util.FileCreator;
import util.Validate;

import java.io.File;

public class UserController {
    private final Converter converter = new Converter();
    private final Validate validate = new Validate();

    public User createUser(String line) {
        User user = null;
        try {
            String[] parts = validate.validateQuantity(line);
            user = new User(parts[0], parts[1], parts[2],
                    converter.convertToLocalDate(parts[3]),
                    converter.convertToLong(parts[4]),
                    converter.convertToChar(parts[5]));
        } catch (IllegalArgumentException e) {
            System.err.println("cannot create user");
            throw new RuntimeException();
        }

        return user;
    }

    public void addUser(String line) {
        try {
            User newUser = createUser(line);
            File newFile = new File(newUser.getSurname());
            UserRepo userRepo = new UserRepo(newFile);
            if (newFile.exists()) {
                userRepo.write(newUser);
            } else {
                FileCreator.createFile(newFile);
                userRepo.write(newUser);
            }
        } catch (RuntimeException e) {
            System.err.println("Please try again");
        }

    }


}
