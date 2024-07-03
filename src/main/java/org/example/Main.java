package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBookStart phoneBookStart = new PhoneBookStart();
        phoneBookStart.start();



        WordCounter wordCounter = new WordCounter();
        // Создаем массив слов
        String[] words = {
                "apple", "banana", "orange", "apple", "kiwi",
                "banana", "grape", "apple", "orange", "kiwi",
                "peach", "grape", "melon", "peach", "kiwi"
        };

        wordCounter.countWords(words);


    }


}
