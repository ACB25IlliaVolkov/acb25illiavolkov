package ACB25.Week2.Home;

import ACB25.myClass.AllOfMe;

public class Task43ReversMaxMinNumber {

    public static void main(String[] args) {

        int[] arNums = AllOfMe.createMassWithRandomNumber(6, 3, 12);

        AllOfMe.printMass(arNums);

        int maxNumber = Task41MaxMinNumber.findMaxNumber(arNums);
        int minNumber = Task41MaxMinNumber.findMinNumber(arNums);

        int posMax = findPosNumber(arNums, maxNumber);
        int posMin = findPosNumber(arNums, minNumber);

        arNums[posMax] = minNumber;
        arNums[posMin] = maxNumber;

        System.out.println("Заменены позиции "+(posMin+1)+" и "+(posMax+1));

        AllOfMe.printMass(arNums);
    }

    public static int findPosNumber (int[] arNums, int Num) {

        int pos = 0;

        for (int i=0; i<arNums.length; i++){

            if (arNums[i]==Num){
                pos = i;
                break;
            }
        }

        return pos;
    }
}
