package ru.geekbrains.java2.week;

public class DaysOfWeekMain {
    static final int workHoursInWeek = 40;
    static final int normWorkDay = 8;
    public static void main(String[] args) {
        DaysOfWeek d = DaysOfWeek.TUESDAY;
        DaysOfWeek d1 = DaysOfWeek.FRIDAY;
        for (DaysOfWeek day: DaysOfWeek.values()) {
            countWorkHours(day);
        }
    }
    static void countWorkHours(DaysOfWeek days) {
        switch (days) {
            case MONDAY:
                System.out.println("Осталось отработать: " + (workHoursInWeek - (normWorkDay * days.ordinal())));
                break;
            case TUESDAY:
                System.out.println("Осталось отработать: " + (workHoursInWeek - (normWorkDay * days.ordinal())));
                break;
            case WEDNESDAY:
                System.out.println("Осталось отработать: " + (workHoursInWeek - (normWorkDay * days.ordinal())));
                break;
            case THURSDAY:
                System.out.println("Осталось отработать: " + (workHoursInWeek - (normWorkDay * days.ordinal())));
                break;
            case FRIDAY:
                System.out.println("Осталось отработать: " + (workHoursInWeek - (normWorkDay * days.ordinal())));
                break;
            default:
                System.out.println("Выходной день!");
        }
    }
}