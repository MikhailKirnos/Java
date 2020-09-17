package Lesson_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ввод значений кота
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя кота: ");
        String nameCat = scanner.nextLine();
        System.out.println("Введите дальность бега кота: ");
        int runCat = scanner.nextInt();
        System.out.println("Введите дальность плавания кота: ");
        int swimCat = scanner.nextInt();
        System.out.println("Введите высоту прыжка кота: ");
        double jumpCat = scanner.nextInt();
        Cat cat1 = new Cat(nameCat, runCat, swimCat, jumpCat);

        //Ввод значений собаки
        scanner = new Scanner(System.in);
        System.out.println("Введите имя собаки: ");
        String nameDog = scanner.nextLine();
        System.out.println("Введите дальность бега собаки: ");
        int runDog = scanner.nextInt();
        System.out.println("Введите дальность плавания собаки: ");
        int swimDog = scanner.nextInt();
        System.out.println("Введите высоту прыжка собаки: ");
        double jumpDog = scanner.nextInt();
        Dog dog1 = new Dog(nameDog, runDog, swimDog, jumpDog);

        //Вывод значений в консоль
        System.out.println(cat1);
        System.out.println();
        System.out.println(dog1);

    }


}
