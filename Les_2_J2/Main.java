package Lesson_2;

public class Main {

    public static void main(String[] args) {

        try {
            exception(5, 4);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static void exception(int x, int y) {

        int sum = 0;

        if (x != 4) {
            throw new MyArraySizeException("Количество строк массива должно равняться 4! Вы пытаетесь задать "+ x + " строк!", x);
        }
        if (y != 4) {
            throw new MyArraySizeException("Количество элементов массива в каждой строке должно равняться 4!Вы пытаетесь задать "+ y + " элементов!", y);
        }

        String[][] arr = {
                {"1", "16", "22", "34"},
                {"13", "5", "23", "35"},
                {"14", "18", "24", "36"},
                {"15", "19", "25", "37"},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    int num = Integer.parseInt(arr[i][j]);
                    sum = sum + num;

                } catch (RuntimeException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "], [" + j + "] невозможно преобразовать элемент массива в int значение!");
                }
            }
        }

        System.out.println("Сумма элементов массива равна: " + sum);
    }
}
