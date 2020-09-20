package Lesson_7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Рыжий", 15));
        cats.add(new Cat("Белый", 7));
        cats.add(new Cat("Серый", 3));
        cats.add(new Cat("Чёрный", 15));

        ArrayList<Plate> plates = new ArrayList<>();
        plates.add(new Plate(15));
        plates.add(new Plate(13));
        plates.add(new Plate(10));

        int countCat = 0;
        int countPlates = 0;

        while (countCat < cats.toArray().length) {
            cats.get(countCat).infoCatFirst();
            countCat++;
        }

        while (countPlates < plates.toArray().length) {
            System.out.print("Тарелка №: " + (countPlates + 1) + " ");
            plates.get(countPlates).infoPlateFirst();
            countPlates++;
        }
        while (countCat < cats.toArray().length) {
            cats.get(countCat).infoCatFirst();
            countCat++;
        }

        for (countCat = 0; countCat < cats.toArray().length; countCat++) {
            for (countPlates = 0; countPlates < plates.toArray().length; countPlates++) {
                do {
                    cats.get(countCat).catEating(plates.get(countPlates));
                    cats.get(countCat).infoCat();
                    plates.get(countPlates).infoPlate();

                    if (plates.get(countPlates).getFood() == 0) {
                        System.out.println("Тарелка № " + (countPlates + 1) + " пуста");
                        countPlates++;
                    }


                    if (cats.get(countCat).isSatiety()) {
                        countCat++;
                    }

                    if (countPlates == (plates.toArray().length) && ((!cats.get(countCat).isSatiety()))) {
                        System.out.println("Котик " + cats.get(countCat).name + " не наелся, нужно добавить минимум: " + cats.get(countCat).appetite + " единиц еды");
                        plates.get(countPlates).addFood();
                        cats.get(countCat).catEating(plates.get(countPlates));
                        cats.get(countCat).infoCat();
                    }

                } while ((!cats.get(countCat).isSatiety()));
                System.out.println("Все котики сыты!");
            }
        }
    }
}
