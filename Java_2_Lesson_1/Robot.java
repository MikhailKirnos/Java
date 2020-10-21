package Lesson_1;

public class Robot implements JumpRun{


    int jumpHeight = 1;
    int runningDistance = 10;

    @Override
    public void jump() {
        System.out.println("Робот прыгает!");
    }

    @Override
    public void run() {
        System.out.println("Робот бежит!");
    }
}
