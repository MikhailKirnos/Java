package Lesson_3;

import java.util.*;

public class TelephoneNumber {

    private HashMap<String, String> tb = new HashMap<>();

    public void put(String s, String o) {
    }

    public void setTb() {
        System.out.println(tb);
    }

    public void addTb(String number, String name) {

        tb.put(number, name);
        System.out.println("Вы добавили в телефонны справочник аббонента: " + name + ", которому присвоен телефонный номер: " + number);
    }

    public String getMap(String name) {

        String desiredString = new String(name);

        for (Map.Entry<String, String> entry : tb.entrySet()) {
            if (desiredString.equals(entry.getValue())) {

                System.out.print("Фамилия: " + entry.getValue() + " ");
                System.out.print("Телефонный номер: " + entry.getKey() + " ");
                System.out.println(" ");
            }
        }
        return "Вы искали абонента с фамилией: " + desiredString;
    }
}





