package org.example;

public class Park {


        // Внутренний класс для хранения информации об аттракционах
        public class Attraction {
            private String name;
            private String openingTime;
            private String closingTime;
            private double cost;

            // Конструктор внутреннего класса Attraction
            public Attraction(String name, String openingTime, String closingTime, double cost) {
                this.name = name;
                this.openingTime = openingTime;
                this.closingTime = closingTime;
                this.cost = cost;
            }

            // Метод для вывода информации об аттракционе
            public void displayInfo() {
                System.out.println("Аттракцион: " + name);
                System.out.println("Время работы: " + openingTime + " - " + closingTime);
                System.out.println("Стоимость: " + cost + " рублей");
                System.out.println();
            }
        }

        // Пример использования класса Park с внутренним классом Attraction
        public static void main(String[] args) {
            // Создаем объект Park
            Park park = new Park();

            // Создаем объекты аттракций с помощью внутреннего класса Attraction
            Park.Attraction attraction1 = park.new Attraction("Карусель", "10:00", "18:00", 150.0);
            Park.Attraction attraction2 = park.new Attraction("Горка", "11:00", "19:00", 200.0);

            // Выводим информацию об аттракциях
            attraction1.displayInfo();
            attraction2.displayInfo();
        }


}
