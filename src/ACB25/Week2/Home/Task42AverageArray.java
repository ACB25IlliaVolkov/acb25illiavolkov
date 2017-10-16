package ACB25.Week2.Home;

import ACB25.myClass.AllOfMe;

public class Task42AverageArray {

    public static void main(String[] args) {

        int arNums[] = AllOfMe.createMassWithRandomNumber(15, -12, 14);

        AllOfMe.printMass(arNums);

        System.out.println("Среднее арифметическое массива = " + averageArray(arNums));

    }

    public static double averageArray(int[] arNums) {

        int average = 0;

        for (int i: arNums){
            average += i;
        }

        return average/arNums.length;
    }


}

