package ru.geekbrains.java2.marthon;

public class Cat implements RunJumpable {
    static final int RUN_LIMITATION = 350;
    static final int JUMP_LIMITATION = 4;
    private String name = "Коту" ;

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