package ACB25.Week2.Home;

import ACB25.myClass.AllOfMe;

public class Task46MaxAverageArrayPart {

    public static void main(String[] args) {

        int[] arNums = AllOfMe.createMassWithRandomNumber(10, 1, 25);

        int[] arNums1 = new int[5];
        int[] arNums2 = new int[5];


        int sum1 = 0;
        int sum2 = 0;

        for (int i=0; i<arNums.length; i++){

            if (i<(arNums.length/2)) {

                arNums1[i] = arNums[i];
                sum1 += arNums[i];
            }
            else {

                arNums2[i-5] = arNums[i];
                sum2 += arNums[i];
            }
        }

        AllOfMe.printMass(arNums);

        if (sum1/arNums1.length < sum2/arNums2.length){

            AllOfMe.printMass(arNums2);
        }
        else {

            AllOfMe.printMass(arNums1);
        }

    }

}
