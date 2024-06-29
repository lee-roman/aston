package org.example.animals;



public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Снежок"),
                new Cat("Рыжик"),
                new Cat("Мурка")
        };

        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 5);
        }

        System.out.println("Остаток еды в миске: " + bowl.getFood() + " единиц.");

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        bowl.addFood(15);
        System.out.println("Добавлено 15 единиц еды. Текущий уровень еды в миске: " + bowl.getFood() + " единиц.");

        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(bowl, 5);
            }
        }

        System.out.println("Остаток еды в миске после второй попытки: " + bowl.getFood() + " единиц.");

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        System.out.println("Всего создано животных: " + Animal.getCount());
        System.out.println("Из них собак: " + Dog.getDogCount());
        System.out.println("Из них котов: " + Cat.getCatCount());
    }
}
