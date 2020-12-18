package Lesson_6;

public abstract class Animal {

    protected String name;
    protected int run;
    protected int swim;
    protected double jump;

    public Animal(String name, int run, int swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;

    }public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }

    public String toString(){
        return "Дальность бега " + name + " равна " + run + "\nДальность плавания равна: " + swim + "\nА Высота прыжка равна: " + jump;
    }

}
