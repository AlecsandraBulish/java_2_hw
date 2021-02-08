package ru.geekbrains.java2.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Brook", "9-77-567");
        phoneBook.add("Black", "7-44-342");
        phoneBook.add("Flint", "7-99-372");
        phoneBook.add("Korneev", "8-45-309");
        phoneBook.add("Black", "7-40-232");
        System.out.println(phoneBook.get("Black"));
    }
}







