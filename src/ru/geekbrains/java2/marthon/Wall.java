package ru.geekbrains.java2.marthon;

public class Wall implements OverCome {
    static final int HIGH = 2;
    static final String name = "Стену";


    public String getName() {
        return name;
    }


    @Override
    public boolean overComeTheObstacles(RunJumpable r) {
        if (r.jump()) {
            return true;
        } else {
            return false;
        }
    }
}
