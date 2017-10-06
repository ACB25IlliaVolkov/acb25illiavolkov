package Week2.Home;

import myClass.AllOfMe;

public class Tasc410SplitArray {

    public static void main(String[] args) {

        int[] arNums = AllOfMe.createMassWithRandomNumber(15, 2, 25);

        AllOfMe.printMass(arNums);

        int[] arSplit = splitArray(arNums, 5, 10);

        AllOfMe.printMass(arSplit);

    }

    public static int[] splitArray(int[] inArr, int startPos, int endPos){

        int[] outArr = new int[inArr.length-(endPos-startPos)-1];

        int num = 0;

        for (int i=0; i<inArr.length; i++){

            if ((i<startPos) || (i>endPos)) {

                outArr[num] = inArr[i];

                num += 1;
            }
        }

        return outArr;
    }


}
