package home.work12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person {
    private final String surname;
    private final String name;
    private final String patronymic;
    private String dateOfBirth;

    public Person(String surname, String name, String patronymic, String dateOfBirth) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String fullName) {
        String[] partOfTheName = fullName.split("\\s+");
        this.name = partOfTheName[1];
        this.surname = partOfTheName[0];
        this.patronymic = partOfTheName[2];
    }

    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }

    public String getNameAndPatronymicInitials() {
        char nameInitials = name.charAt(0);
        char patronymicInitials = patronymic.charAt(0);
        return surname + " " + nameInitials + ". " + patronymicInitials + ".";
    }

    public int age() throws ParseException {
        Date birthDate = new SimpleDateFormat("dd.MM.yyyy").parse(dateOfBirth);
        LocalDate localDateBirth = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dateNow = LocalDate.now();
        return Period.between(localDateBirth, dateNow).getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
