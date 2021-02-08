package ru.geekbrains.java2.collections;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneList = new LinkedHashMap<>();

    void add(String surname, String phoneNumber) {
        List<String> numbersList = new LinkedList<>();
        if (phoneList.get(surname) == null) {
            numbersList.add(phoneNumber);
        } else {
            numbersList = phoneList.get(surname);
            numbersList.add(phoneNumber);
        }
        phoneList.put(surname, numbersList);
    }

        List<String> get (String surname){
            return phoneList.get(surname);
        }



}