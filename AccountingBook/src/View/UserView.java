package View;

import Controller.UserController;
import Model.Repository.UserRepo;
import util.FileCreator;
import util.Validate;
import Model.User;

import java.io.File;

import java.util.Objects;
import java.util.Scanner;

public class UserView {


    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void run() {
        UserController userController = new UserController();
        while (true) {
            String line = prompt("Enter your Name Surname Patronymic Birthdate(dd.MM.yyyy) PhoneNumber Sex(f/m)" +
                    " - exactly in that order, or exit \n");
            if (Objects.equals(line, "exit")) {
                return;
            }
            userController.addUser(line);
        }
    }


}
