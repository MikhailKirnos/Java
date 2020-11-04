package Lesson_5;

public class Main {

    public static void main(String[] args) {

        Arr arr1 = new Arr();
        arr1.getArr1();
        long timeA1 = System.currentTimeMillis();
        arr1.getArr1Part2();
        long timeB1 = System.currentTimeMillis();
        arr1.getArr2();
        long timeA2 = System.currentTimeMillis();
        arr1.getArr2Part2();
        long timeB2 = System.currentTimeMillis();
        arr1.getArr2Part3();
        long timeC2 = System.currentTimeMillis();
        arr1.getArr2Part4();
        long timeD2 = System.currentTimeMillis();

        System.out.println(" ");
        System.out.println("Время заполнения 1 при первом способе равно: " + timeA1);
        System.out.println("Время выполнения первого способа равно: " + (timeB1 - timeA1));
        System.out.println("__________________________");
        System.out.println("Время выполнения разбивки при втором способе равно: " + timeA2);
        System.out.println("Время заполнения 1 при втором способе равно: " + (timeB2 - timeA2));
        System.out.println("Время выполнения второго способа равно: " + (timeC2 - timeB2));
        System.out.println("Время выполнения склейки при втором способе равно: " + (timeD2 - timeC2));
    }
}
