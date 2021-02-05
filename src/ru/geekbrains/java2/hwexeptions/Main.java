package ru.geekbrains.java2.hwexeptions;

public class Main {
    public static void main(String[] args) {
        String array[][] = {{"167", "9", "89", "23"},
                {"124", "11", "88", "100"}, {"45", "127", "77", "55"}, {"45", "127", "77", "5gg"}};
        try {
            System.out.println(count(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }

    static  int count(String arr[][]) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int n = 0;
                if (!(arr.length == 4) || (!(arr[i].length == 4))) {
                    throw new MyArraySizeException();
                }
                try {
                    n = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("The problem appeared in column: " + i + " row: " + j);
                }
                sum +=n;
            }

        }
        return sum;
    }
}


