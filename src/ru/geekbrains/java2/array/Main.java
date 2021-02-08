package ru.geekbrains.java2.array;

import ru.geekbrains.java2.collections.PhoneBook;

import java.util.*;

public class Main {
    static String words[];

    public static void main(String[] args) {
        words = new String[]{"pizza", "tomato", "book", "side", "cup", "food", "sport", "dream", "laptop", "job", "letter",
                "cup", "sport", "pizza", "book", "cup", "laptop", "pizza"};
        // вывод уникальных слов
        Set<String> listWords = new HashSet<>(Arrays.asList(words));
        System.out.println(listWords);
        countRepeating();
    }
    // подсчет повторений
    static void countRepeating() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int val = map.getOrDefault(words[i], 0);
            map.put(words[i], val + 1);
        }
        System.out.println(map);
    }
}

