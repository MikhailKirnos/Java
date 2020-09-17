package Lesson_6;

import java.util.Objects;
import java.util.Random;

public class Cat extends Animal {

    int catMaxRun = (int) (100+Math.random()*200);//другие делаются по аналогии, так что не стал перегружать код.
    int catMaxSwim = 0;
    double catMaxJump = 2;

    public Cat(String name, int run, int swim, double jump) {
        super(name, run, swim, jump);
    }

    public String toString() {
        return "Дальность бега кота " + name + " равна: " + run + ", что является " + catRun() +
                "\nМаксимальная скорость кота равна: " + catMaxRun +
                "\nДальность плавания кота равна: " + swim + ", что является " + catSwim() +
                "\nА Высота прыжка равна кота: " + jump + ", что является " + catJump();
    }

    public boolean catRun() {
        return run <= catMaxRun;
    }

    public boolean catSwim() {
        return swim <= catMaxSwim;
    }

    public boolean catJump() {
        return jump <= catMaxJump;

    }
}


