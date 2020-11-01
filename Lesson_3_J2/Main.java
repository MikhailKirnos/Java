package Lesson_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Корова", "Собака", "Человек", "Собака", "Кошка",
                "Корова", "Корова", "Кит", "Человек", "Кит", "Жираф", "Ондатра", "Собака", "Кошка", "Кабан"));

        Set<String> set = new TreeSet<>(list);
        int size = set.size();

        System.out.print("Уникальные слова в списке: " + set);
        System.out.println(" ");
        System.out.println("Количество уникальных слов равно: " + size);

        Map<String, Integer> map = new HashMap<>();

        for (String string : list) {
            Integer count = map.getOrDefault(string, 0);
            map.put(string, count + 1);
        }
        System.out.println("Количество повторений для слов равно: " + map);
        System.out.println("----------------------------------");

        TelephoneNumber tb = new TelephoneNumber();

        tb.addTb("89128675432", "Иванов");
        tb.addTb("89178905684", "Петров");
        tb.addTb("89214356790", "Сидоров");
        tb.addTb("89456952134", "Иванов");
        tb.addTb("89741263520", "Сергеев");
        tb.addTb("89994568394", "Артемьев");
        tb.addTb("896543219865", "Алексеев");
        tb.addTb("89521046321", "Терентьев");

        tb.setTb();

        tb.addTb("8900000000", "Вася Пупкин");

        tb.setTb();

        String nameNew = "Иванов";
        System.out.println(tb.getMap(nameNew));
    }
}
