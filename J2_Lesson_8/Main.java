package J2_Lesson_8;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Задача №1
        Integer[] arr = {1, 365, -1243, 0, 109, - 147};

        System.out.println("Задание №1\n" + Arrays.toString(arr));
        swapElements(arr, 1, 4);
        System.out.println(Arrays.toString(arr));


        //Задача №2
        List<Integer> list = converter(arr);
        System.out.println("Задание №2\n" + list.getClass() + " : " + list);

        //Задание №3
        System.out.println("Задание №3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);
//            orangeBox1.moveAt(appleBox);   Error

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] arr, int index1, int index2) {
        T temper = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temper;
    }

    private static <E> List<E> converter(E[] arr) {
        return Arrays.asList(arr);
    }

}
