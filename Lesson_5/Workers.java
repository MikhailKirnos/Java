package Lesson_5;

public class Workers {

    protected String name;
    public String position;
    public String email;
    public String number;
    public int salary;
    public int age;

    public Workers(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Имя работника: " + name + "\nДолжность: " + position + "\nАдрес электронной почты: " + email + "\nТелефонный номер: " + number +
                "\nЗаработная плата: " + salary + " рублей" + "\nВозраст: " + age;
    }
}
