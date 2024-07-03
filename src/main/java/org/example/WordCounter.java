package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCounter {
    public void countWords(String[] words) {
        // Находим уникальные слова
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Выводим список уникальных слов
        System.out.println("Unique words: " + uniqueWords);

        // Считаем количество вхождений каждого слова
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим количество вхождений каждого слова
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
