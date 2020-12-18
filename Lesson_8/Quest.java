package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {

    protected static int score = 7;
    protected static int randomNumber = (int) ((int) 1 + (Math.random() * 100));

    static class MyWindow extends JFrame {

        public MyWindow() {

            JFrame frame = new JFrame("Игра угадай число!");

            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new GridBagLayout());

            JTextField field = new JTextField(20);
            JPanel panel = new JPanel();

            frame.add(field);
            JOptionPane.showMessageDialog(null, "Здравствуй игрок! Тебе предстоит угадать загаданное компьютером число в диапазоне от 1 до 100! Поехали!");

            field.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int playerResult = Integer.parseInt(field.getText());

                    if (score > 0) {
                        if (playerResult < 1 || playerResult > 100) {
                            JOptionPane.showMessageDialog(null, "Вы ввели число: " + field.getText() + "\nЧисло вне диапазона! Попробуй снова!");
                        }
                        if (randomNumber == playerResult) {
                            JOptionPane.showMessageDialog(null, "Поздравляю! Вы победили!");
                            return;

                        } else if (randomNumber > playerResult) {
                            score--;
                            JOptionPane.showMessageDialog(null, "Вы ввели число: " + field.getText() + "\nВаше число меньше загаданного! Попробуйте ещё раз!\nУ вас осталось ещё " + score + " попытки");
                        } else {
                            score--;
                            JOptionPane.showMessageDialog(null, "Вы ввели число: " + field.getText() + "\nВаше число ,больше загаданного! Попробуйте ещё раз!\nУ вас осталось ещё " + score + " попытки");
                        }
                    }

                    if (score == 0) {
                        JOptionPane.showMessageDialog(null, "Вы проиграли! Правильный ответ был: " + randomNumber);
                        return;
                    }

                    field.setText(null);
                }
            });

            frame.setVisible(true);
        }
    }

    public static void main(String[] args) {

        new MyWindow();
    }
}

