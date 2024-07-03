package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи в телефонный справочник
    public void add(String surname, String phoneNumber) {
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для получения списка номеров телефонов по фамилии
    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    // Метод для вывода всего телефонного справочника
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
