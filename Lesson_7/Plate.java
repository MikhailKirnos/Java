package Lesson_7;

import java.util.Scanner;

public class Plate {

    Scanner scanner = new Scanner(System.in);
    protected int maxPlateSize = 15;

    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate(){
    }

    public int getMaxPlateSize() {
        return maxPlateSize;
    }

    public int getFood() {
        return food;
    }

    public void addFood() {
        System.out.println("Сколько единиц еды Вы хотите положить в миску?");
        int foodCount = scanner.nextInt();

        if ((this.food += foodCount) > maxPlateSize){
            System.out.println("Вы добавили слишком много еды, лишняя еда выпала из миски!");
            this.food = maxPlateSize;
        } else
            this.food += (foodCount - foodCount);
    }

    public void decreaseFood(int foodCount) {
        if ((this.food -= foodCount) > 0) {
        } else {
            this.food = 0;
        }
    }

    public void infoPlateFirst() {
        System.out.println("в тарелке " + food + " единиц еды" + " и ёё максимальная вместимость равна: " + maxPlateSize);
    }

    public void infoPlate() {
        System.out.println(this);
    }

    public String toString() {
        return "В тарелке " + food + " единиц корма";
    }
}
