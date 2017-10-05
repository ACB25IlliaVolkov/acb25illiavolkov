package Week2.Home;

import myClass.AllOfMe;

public class Task47SumArray {

    public static void main(String[] args) {

        int[] arNums1 = AllOfMe.createMassWithRandomNumber(15,-15,15);
        int[] arNums2 = AllOfMe.createMassWithRandomNumber(15,-15,15);
        int[] arNums3 = new int[15];

        for (int i=0; i<arNums1.length; i++){

            arNums3[i] = arNums1[i] + arNums2[i];
        }

        AllOfMe.printMass(arNums1);
        AllOfMe.printMass(arNums2);
        AllOfMe.printMass(arNums3);

    }

}
