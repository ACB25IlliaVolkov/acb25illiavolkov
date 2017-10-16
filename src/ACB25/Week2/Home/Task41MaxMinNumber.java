package ACB25.Week2.Home;

import ACB25.myClass.AllOfMe;

public class Task41MaxMinNumber {
    public static void main(String[] args) {
        int arNums[] = AllOfMe.createMassWithRandomNumber(5, 5, 15);

        AllOfMe.printMass(arNums);

        System.out.println("Максимально число = " + findMaxNumber(arNums) + "\n" +
                            "Минимально число = " + findMinNumber(arNums));

    }

    public static int findMinNumber (int[] arNums) {

        int minNumber = arNums[0];

        for (int i: arNums){
            minNumber = Math.min(i, minNumber);
        }

        return minNumber;
    }

    public static int findMaxNumber (int[] arNums) {

        int maxNumber = arNums[0];

        for (int i: arNums){
            maxNumber = Math.max(i, maxNumber);
        }

        return maxNumber;
    }



}
