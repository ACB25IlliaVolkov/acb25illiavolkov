package Week3;

import myClass.AllOfMe;

public class MatrixUtil {

    public static void main(String[] args) {

        int[][] mass = createMatrixWithRandomNumber(5, 5, 25, 99);

        printMatrix(mass);

        int minNum = findMinNumberMatrix(mass);
        int maxNum = findMaxNumberMatrix(mass);

        int[] posMinNum = findPositionNumInMass(mass, minNum);
        int[] posMaxNum = findPositionNumInMass(mass, maxNum);

        System.out.println("Минимальное значение " + minNum + " находится по индексу [" + posMinNum[0] +
                "," + posMinNum[1] + "]");
        System.out.println("Максимальное значение " + maxNum + " находится по индексу [" + posMaxNum[0] +
                "," + posMaxNum[1] + "]");

        mass[posMinNum[0]][posMinNum[1]] = maxNum;
        mass[posMaxNum[0]][posMaxNum[1]] = minNum;

        printMatrix(mass);

        String stringMas = MatrixToString(mass);

        System.out.println(stringMas);

        swapMinMaxColumn(mass);

        printMatrix(mass);
    }



    public static int[][] swapMinMaxColumn(int[][] mass) {

        int[] columnSum = new int[mass[0].length];

        for (int c = 0; c<mass.length; c++) {
            for (int r = 0; r < mass[c].length; r++) {

                columnSum[c] += mass[r][c];
            }
        }

        int minSumColumn = findMinNumberMass(columnSum);
        int maxSumColumn = findMaxNumberMass(columnSum);

        int posMinSumColumn = findPosNumberMass(columnSum, minSumColumn);
        int posMaxSumColumn = findPosNumberMass(columnSum, maxSumColumn);

        int valueMinColMass = 0;
        int valueMaxColMass = 0;

        for (int r = 0; r<mass.length; r++) {

            valueMinColMass = mass[r][posMinSumColumn];
            valueMaxColMass = mass[r][posMaxSumColumn];

            mass[r][posMinSumColumn] = valueMaxColMass;
            mass[r][posMaxSumColumn] = valueMinColMass;
        }

        System.out.println("Максимальная сумма " + maxSumColumn + " в колонке " + posMaxSumColumn);
        System.out.println("Минимальная сумма " + minSumColumn + " в колонке " + posMinSumColumn);

        return mass;
    }



    public static int findMinNumberMass (int[] arNums) {

        int minNumber = arNums[0];

        for (int i: arNums){
            minNumber = Math.min(i, minNumber);
        }

        return minNumber;
    }

    public static int findMaxNumberMass (int[] arNums) {

        int maxNumber = arNums[0];

        for (int i: arNums){
            maxNumber = Math.max(i, maxNumber);
        }

        return maxNumber;
    }

    public static int findPosNumberMass (int[] arNums, int Num) {

        int pos = 0;

        for (int i=0; i<arNums.length; i++){

            if (arNums[i]==Num){
                pos = i;
                break;
            }
        }

        return pos;
    }


    public static String MatrixToString(int[][] mass) {

        String stringMass = "\n";

        for (int r = 0; r<mass.length; r++) {
            for (int c = 0; c < mass[r].length; c++) {

                stringMass = stringMass + mass[r][c] + ",";
            }

            stringMass = stringMass + "\n";
        }

        return stringMass;
    }

    public static int[] findPositionNumInMass(int[][] mass, int number) {

        int[] posMass = new int[2];

        for (int r = 0; r<mass.length; r++) {
            for (int c = 0; c < mass[r].length; c++) {

                if (mass[r][c]==number) {

                    posMass[0] = r;
                    posMass[1] = c;

                    return posMass;
                }

            }
        }

        return posMass;
    }

    public static int[] createMassWithRandomNumber(int massLength, int numberMin, int numberMax) {

        int[] mass = new int[massLength];

        for (int i = 0; massLength > i; i++) {

            mass[i] = AllOfMe.randomNumberRange(numberMin, numberMax);

        }

        return mass;
    }


    public static int[][] createMatrixWithRandomNumber(int massLengthR, int massLengthC, int numberMin, int numberMax) {

        int[][] masOut = new int[massLengthR][massLengthC];

        for (int r = 0; r<massLengthR; r++) {
            for (int c = 0; c < massLengthC; c++) {

                masOut[r][c] = AllOfMe.randomNumberRange(numberMin, numberMax);

            }
        }

        return  masOut;
    }

    public static void printMass(int[] mass) {
        for (int i = 0; mass.length > i; i++) {

            System.out.print(mass[i] + ", ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] mass) {

        for (int r = 0; r<mass.length; r++) {
            for (int c = 0; c < mass[r].length; c++) {

                System.out.print(mass[r][c] + ", ");

            }

            System.out.println();
        }
    }

    public static int findMinNumberMatrix(int[][] arNum) {

        int minNum = arNum[0][0];

        for (int r=0; r<arNum.length; r++ ){

            for (int c=0; c<arNum[r].length; c++){

                    minNum = Math.min(minNum, arNum[r][c]);
            }
        }

        return minNum;
    }

    public static int findMaxNumberMatrix(int[][] arNum) {

        int maxNum = arNum[0][0];

        for (int r=0; r<arNum.length; r++ ){

            for (int c=0; c<arNum[r].length; c++){

                maxNum = Math.max(maxNum, arNum[r][c]);
            }
        }

        return maxNum;
    }
}
