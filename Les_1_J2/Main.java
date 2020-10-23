package Lesson_1;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        jumpTest(human);
        jumpTest(cat);
        jumpTest(robot);

        Object[] pers = {human, cat, robot};
        Object[] let = {treadmill, wall};

        for (int i = 0; i < pers.length; i++) {
            for (int j = 0; j < let.length; j++) {

                if (i == 0) {
                    System.out.print("Человек ");
                }
                if (i == 1) {
                    System.out.print("Кот ");
                }
                if (i == 2) {
                    System.out.print("Робот ");
                }
                if (j == 0) {
                    System.out.println(" успешно пробежал по дорожке");

                } else {
                    System.out.println(" успешно перепрыгнул стену");
                }
            }
        }
    }

    public static void jumpTest(JumpRun j) {
        j.jump();
        j.run();
    }

}
