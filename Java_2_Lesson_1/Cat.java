package Lesson_1;

public class Cat implements JumpRun{


    int jumpHeight = 3;
    int runningDistance = 5;

    @Override
    public void jump() {
        System.out.println("Кот прыгает!");
    }

    @Override
    public void run() {
        System.out.println("Кот бежит!");
    }
}
