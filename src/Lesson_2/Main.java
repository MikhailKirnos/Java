package Lesson_2;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        int[] Replacement = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < Replacement.length; i++) {
            if (Replacement[i] == 0) {
                System.out.print('1');
            } else if (Replacement[i] == 1) {
                System.out.print('0');
            }
        }System.out.println("");

        // Задание №2

        int[] plusNumber = new int[8];
        for (int i = 0; i < plusNumber.length; i++) {
            plusNumber[i] = i * 3;
            System.out.print(plusNumber[i] + " ");
        }System.out.println("");

        // Задание №3
        int[] increase = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < increase.length; i++){
            if (increase[i] < 6){
                increase[i] = increase[i] * 2;
            }
            System.out.print(increase[i] + " ");
        }System.out.println("");

        //Задание №4
        int start = 0;
        int[][] diagonal = new int[5][5];
        for(int i = 0; i < diagonal.length; i++){
            for(int j = 0; j < diagonal.length; j++){
                if(i == j || (i + j) == diagonal.length - 1) start = 1;
                else start = 0;
                System.out.print(start);
            }
            System.out.println();
        }System.out.println("");
        //Задание № 5
        int[] Max_Min = {1, 5, 3, 112, 11, 9, 25, 18, 54};
        int MaxNumber = Max_Min[0];
        int MinNumber = Max_Min[0];
        for (int i = 0; i < Max_Min.length; i++) {
            if(MaxNumber < Max_Min[i])
                MaxNumber = Max_Min[i];
            else if(MinNumber > Max_Min[i])
                MinNumber = Max_Min[i];
        }System.out.println("Максимальное значение массива равно: " + MaxNumber + "\nМинимальное значение массива равно: " + MinNumber);
        System.out.println("");
    }
}
