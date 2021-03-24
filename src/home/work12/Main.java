/*
1) Написать класс Person, у которого есть следующие поля:
- Фамилия, Имя, Отчество, дата рождения.
Написать конструкторы:
- на все поля,
- только на ФИО
- который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович",
и задает отдельные значения в поля Фамилия, Имя, Отчество.
Написать методы:
- который возвращает полное ФИО типа "Иванов Иван Иванович"
- краткое ФИО типа "Иванов И. И."
2*) Дата рождения задается как строка типа "18.12.1985"
- добавить метод который выводит количество полных лет
 */
package home.work12;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Person person = new Person("Bazhenova", "Anna", "Ihorivna", "10.06.2002");
        Person person1 = new Person("Dombrovski Mikel Fernandos");
        System.out.println("Person №1:");
        System.out.println(person);
        System.out.println(person.getFullName());
        System.out.println(person.getNameAndPatronymicInitials());
        System.out.println(person.age() + " years");
        System.out.println();
        System.out.println("Person №2:");
        System.out.println(person1.getFullName());
        System.out.println(person1.getNameAndPatronymicInitials());
    }
}
