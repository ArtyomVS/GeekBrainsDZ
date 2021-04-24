package Lesson2;

import java.util.Arrays;

public class QuadroArray {
    public static void main(String[] args) {
        try {
            String[][] arayDouble = new String[4][4];
            String c = "0";
            for (int i = 0; i < arayDouble.length; i++) {
                for (int j = 0; j < arayDouble[i].length; j++) {
                    arayDouble[i][j] = c;
                    //System.out.print(arayDouble[i][j] + " | ");
                }
            }
            String[][] arayDouble1 = new String[7][5];
            String d = "0";
            for (int i = 0; i < arayDouble.length; i++) {
                for (int j = 0; j < arayDouble[i].length; j++) {
                    arayDouble[i][j] = d;
                    //System.out.print(arayDouble[i][j] + " | ");
                }
            }
            quadroArray(arayDouble);
            quadroArray(arayDouble1);
        } catch (MyArraySizeException e) {
            System.out.println("Массив не 4 на 4");
        } catch (MyArrayDataExceptions f) {
            System.out.println("Что-то пошло не таккк");
        }

    }


    public static String[][] quadroArray(String[][] arayDouble) throws MyArraySizeException, MyArrayDataExceptions {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arayDouble.length; i++) {
            for (int j = 0; j < arayDouble[i].length; j++) {
                a += 1;
                b += 1;
            }
        }
        if ((a & b) != 16) {
            throw new MyArraySizeException("Почему эта штука не выводиться в консоль?");
        }


        Object q = 0;
        Object q1 = 0;
        int sumArray = 0;
        int[][] myIntArray = new int[4][4];
        for (int i = 0; i < arayDouble.length; i++) {
            for (int j = 0; j < arayDouble[i].length; j++) {
                q = myIntArray[i];
                q1 = myIntArray[j];
                if (q instanceof int[] && q1 instanceof int[]) {
                    myIntArray[i][j] = Integer.parseInt(arayDouble[i][j]);
                    sumArray += myIntArray[i][j];
                    System.out.print(sumArray + " | ");
                } else {
                    throw new MyArrayDataExceptions("Почему эта штука не выводиться в консоль?");
                }

            }
            System.out.println();
        }

        return arayDouble;
    }
}
