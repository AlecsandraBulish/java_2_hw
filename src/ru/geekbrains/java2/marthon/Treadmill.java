package ru.geekbrains.java2.marthon;

public class Treadmill implements OverCome {
    static final int DISTANCE = 700;
    static final  String name = "Беговой дорожке";

    public String getName() {
        return name;
    }

    public static int getDISTANCE() {
        return DISTANCE;
    }

    @Override
    public boolean overComeTheObstacles(RunJumpable r) {
        if (r.run()) {
            return true;
        } else {
            return false;
        }
    }
}