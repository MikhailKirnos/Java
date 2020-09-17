package Lesson_5;

public class Main {

    public static void main(String[] args) {

        Workers[] workersArray = new Workers[5];
        workersArray[0] = new Workers("Иванов Иван", "Менеджер", "ivanov@mail.ru", "89128456936", 40000, 45);
        workersArray[1] = new Workers("Пётр Петров", "Продавец", "petrov@mail.ru", "89179563147", 25000, 25);
        workersArray[2] = new Workers("Михаил Васильев", "Программист", "vasiliev@mail.ru", "89176543244", 35000, 25);
        workersArray[3] = new Workers("Владимир Александров", "Грузчик", "Alexandrov@mail.ru", "89249663147", 23000 ,43);
        workersArray[4] = new Workers("Сергей Антонов", "Водитель", "antonov@mail.ru", "891012568687", 30000, 46);

        for (int i = 0; i < 5; i++) {
            if(workersArray[i].age > 40){
                System.out.println(workersArray[i]);
            }
        }
    }
}
