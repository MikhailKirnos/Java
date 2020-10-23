package Lesson_1;

public class Human implements JumpRun {

    int jumpHeight = 5;
    int runningDistance = 7;


    @Override
    public void jump() {
        System.out.println("Человек прыгает!");
    }

    @Override
    public void run() {
        System.out.println("Человек бежит!");
    }
}
