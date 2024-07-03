package org.example;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PhoneBookStart {
    public void start() {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Поиск абонента");
            System.out.println("2. Добавить абонента");
            System.out.println("3. Показать весь справочник");
            System.out.println("4. Закончить работу");
            System.out.print("Выберите пункт меню: ");

            int choice = -1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число от 1 до 4.");
                scanner.nextLine();  // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите фамилию: ");
                    String surnameToFind = scanner.nextLine();
                    List<String> phones = phoneBook.get(surnameToFind);
                    if (phones.isEmpty()) {
                        System.out.println("Абонент не найден.");
                    } else {
                        System.out.println("Номера телефонов для " + surnameToFind + ": " + phones);
                    }
                    break;

                case 2:
                    System.out.print("Введите фамилию: ");
                    String surnameToAdd = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.add(surnameToAdd, phoneNumber);
                    System.out.println("Абонент добавлен.");
                    break;

                case 3:
                    System.out.println("Телефонный справочник:");
                    phoneBook.printAll();
                    break;

                case 4:
                    System.out.println("Завершение работы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Некорректный выбор. Пожалуйста, попробуйте снова.");
            }
            System.out.println();
        }
    }
}
