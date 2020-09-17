package Lesson_6;

public class Dog extends Animal {

    int dogMaxRun = (int)(400 + Math.random()*600);//другие делаются по аналогии, так что не стал перегружать код.
    int dogMaxSwim = 10;
    double dogMaxJump = 0.5;

    public Dog(String name, int run, int swim, double jump) {
        super(name, run, swim, jump);
    }

    public String toString() {
        return "Дальность бега собаки " + name + " равна: " + run + ", что является " + dogRun() +
                "\nМаксимальная скорость собаки равна: " + dogMaxRun +
                "\nДальность плавания равна собаки: " + swim + ", что является " + dogSwim() +
                "\nА Высота прыжка равна собаки: " + jump + ", что является " + dogJump();
    }

    public boolean dogRun() {
        return run <= dogMaxRun;
    }

    public boolean dogSwim() {
        return swim <= dogMaxSwim;
    }

    public boolean dogJump() {
        return jump <= dogMaxJump;
    }
}
