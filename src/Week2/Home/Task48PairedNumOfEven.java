package Week2.Home;

import myClass.AllOfMe;

public class Task48PairedNumOfEven {

    public static void main(String[] args) {

        int[] arNums = new int[13];

        for (int i=0; i<arNums.length; i++){

            if (((i+1)%2)==0){

                arNums[i] = 2;
            }
            else{

                arNums[i] = 3;

            }
        }

        AllOfMe.printMass(arNums);
    }

}
