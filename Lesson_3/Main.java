package Lesson_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        guessNumber();
        guessWord();

    }

   public static void guessNumber() {
        int score = 3;
        int randomNumber = (int) (Math.random() * 9);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добрый день мой друг, хочу предложить тебе сыграть в игру угадай число\n" +
                "Тебе нужно будет попробовать угадать случайное число от 0 до 9 с трёх попыток! Начнём же!");

        System.out.println("Первая попытка! Попробуй угадать какое число загадал компьютер?");

        while (score != 0) {
            int playerResult = scanner.nextInt();
            if (randomNumber == playerResult) {
                System.out.println("Поздравляю! Вы победили!");
                System.out.println("Перейдём к следующему заданию");
                break;
            } else if (randomNumber > playerResult) {
                score--;
                System.out.println("Ваше число меньше загаданного! Попробуйте ещё раз!\nУ вас осталось ещё " + score + " попытки");
            } else if (randomNumber < playerResult) {
                score--;
                System.out.println("Ваше число ,больше загаданного! Попробуйте ещё раз!\nУ вас осталось ещё " + score + " попытки");
            }
        }
        if (score == 0) {
            System.out.println("Вы проиграли! Правильный ответ был: " + randomNumber);
            System.out.println("Перейдём к следующему заданию");
        }
    }

    public static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("А теперь попробуй угадать, какое из слов загадал компьютер! Тебе нужно выбрать из следующих слов: ");
        int random = (int) (Math.random() * 25);

        String randomAnswer = words[random];

        for (String word : words) {
            System.out.print(word + " ");

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String userAnswer = scanner.next();
        if (randomAnswer.equals(userAnswer)) {
            System.out.println("Поздравляю! Вы выиграли!");
        }
        int maxWordLength = 9;
        while (!randomAnswer.equals(userAnswer) && maxWordLength != 0) {
            maxWordLength--;

            if (randomAnswer.length() <= userAnswer.length()) {
                if (maxWordLength >= randomAnswer.length() && randomAnswer.charAt(maxWordLength) == userAnswer.charAt(maxWordLength)) {
                    System.out.print(userAnswer.charAt(maxWordLength));
                } else {
                    System.out.print('*');
                }
            } else {
                System.out.print('*');
            }

        }
    }
}


