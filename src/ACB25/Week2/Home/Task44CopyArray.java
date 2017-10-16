package ACB25.Week2.Home;

import ACB25.myClass.AllOfMe;

public class Task44CopyArray {

    public static void main(String[] args) {

        int[] arNums1 = AllOfMe.createMassWithRandomNumber(15, -14, 25);
        int[] arNums2 = new int[arNums1.length];

        for (int i=0; i<arNums1.length; i++){
            arNums2[i] = arNums1[i];
        }

        AllOfMe.printMass(arNums1);
        AllOfMe.printMass(arNums2);

    }

}
