package ru.geekbrains.java2.week;

public enum DaysOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String rusName;

    DaysOfWeek(String rusName) {
        this.rusName = rusName;
    }
}

