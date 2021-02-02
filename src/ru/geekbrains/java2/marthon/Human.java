package ru.geekbrains.java2.marthon;

public class Human implements RunJumpable {
    static final int RUN_LIMITATION = 950;
    static final int JUMP_LIMITATION = 3;
    private String name = "Человеку";

    @Override
    public boolean run() {
        if (RUN_LIMITATION >= Treadmill.DISTANCE) {
            System.out.println(name + " удалось преодалеть дистанцию на " + Treadmill.name);
            return true;
        } else {
            System.out.println(name + " не удалось преодалеть дистанцию на " + Treadmill.name);
            return false;
        }
    }

    @Override
    public boolean jump() {
        if (JUMP_LIMITATION >= Wall.HIGH) {
            System.out.println(name + " удалось перепрыгнуть " + Wall.name);
            return true;
        } else {
            System.out.println(name + " не удалось перепрыгнуть " + Wall.name);
            return false;
        }
    }
}
