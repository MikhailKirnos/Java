package Lesson_7;

public class Cat {

    protected final String name;
    protected int appetite;
    private boolean satiety = false;

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void infoCatFirst() {
        System.out.println("Имя кота: " + name + " и его аппетит равен: " + appetite);
    }

    public void catEating(Plate plate) {

        if (plate.getFood() >= appetite) {
            System.out.println("Кот " + name + " съел " + appetite + " единиц еды.");
            satiety = true;
        } else {
            System.out.println("Кот " + name + " съел " + plate.getFood() + " единиц еды.");
            this.appetite -= (appetite - plate.getFood());
            System.out.println("Кот " + name + " ненаелся! Теперь его аппетит равен: " + this.appetite);
            satiety = false;
        }
        doEat(plate);
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public void infoCat() {
        System.out.println(this);
    }

    public String toString() {
        if (satiety) return "Кот " + name + " наелся!";
        return "Аппетит кота равен " + appetite + " единиц";
    }
}
