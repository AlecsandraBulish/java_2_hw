package ru.geekbrains.java2.marthon;

public class Main {

    public static void main(String[] args) {
        RunJumpable participants[] = {new Cat(), new Robot(), new Human()};
        OverCome obstacles[] = {new Wall(), new Treadmill()};


        for (int i = 0; i <participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (!(obstacles[j].overComeTheObstacles(participants[i]))) {
                    break;
                }
            }
        }
    }
}
