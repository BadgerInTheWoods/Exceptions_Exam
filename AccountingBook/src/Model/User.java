package Model;

import java.time.LocalDate;

public class User {

    private String Name;
    private String Surname;
    private String LastName;
    private LocalDate BirthDate;
    private Long PhoneNumber;
    private char Sex;

    public User(String Name, String Surname,String LastName,LocalDate BirthDate,Long PhoneNumber,char Sex){
        this.Name = Name;
        this.Surname = Surname;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
        this.PhoneNumber = PhoneNumber;
        this.Sex = Sex;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getLastName() {
        return LastName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public char getSex() {
        return Sex;
    }


}
