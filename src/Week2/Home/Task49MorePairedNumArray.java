package Week2.Home;

import myClass.AllOfMe;

public class Task49MorePairedNumArray {

    public static void main(String[] args) {

        int[] arNums1 = AllOfMe.createMassWithRandomNumber(25, 25, 75);
        int pairedNumAr1 = 0;

        int[] arNums2 = AllOfMe.createMassWithRandomNumber(25, 25, 75);
        int pairedNumAr2 = 0;

        for (int i=0; i<arNums1.length; i++){

            if ((arNums1[i]%2)==0){
                pairedNumAr1 +=1;
            }

            if ((arNums2[i]%2)==0){
                pairedNumAr2 +=1;
            }
        }

        AllOfMe.printMass(arNums1);
        AllOfMe.printMass(arNums2);

        System.out.println("Парных значений больше в массиве "+(pairedNumAr1<pairedNumAr2 ? 2 : 1) + " (в первом " + pairedNumAr1 + " , во втором " + pairedNumAr2 + ")");
    }

}
