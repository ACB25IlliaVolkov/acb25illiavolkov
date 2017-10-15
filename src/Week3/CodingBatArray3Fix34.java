package Week3;

public class CodingBatArray3Fix34 {

    public static void main(String[] args) {

        int[] mass = {3,2,2,4};//MatrixUtil.createMassWithRandomNumber(15, 2, 5);

        System.out.println("Исходный массив");
        MatrixUtil.printMass(mass);


        int[] massChanged = fix34(mass);

        System.out.println("Итоговый массив");

        MatrixUtil.printMass(massChanged);
    }

    public static int[] fix34(int[] nums) {

        int [] posNum1Mass = findAllNumberInMass(nums, 3);
        int [] posNum2Mass = findAllNumberInMass(nums, 4);

        int[] massChanged = changeNumPosInMas(nums, posNum1Mass, posNum2Mass);

        System.out.println("Позиции заданных чисел: 3 и 4");

        MatrixUtil.printMass(posNum1Mass);
        MatrixUtil.printMass(posNum2Mass);


        return massChanged;
    }

    public static int[] findAllNumberInMass(int[] inMas, int num1) {

        int[] outMas = new int[inMas.length];

        int counterNum1 = 0;

        for (int i = 0; i < inMas.length; i++){

            if (inMas[i] == num1) {

                outMas[counterNum1] = i;

                counterNum1 += 1;
            }
        }

        return outMas;
    }

    public static int[] changeNumPosInMas(int[] inMas, int[] inNumPos1, int[] inNumPos2) {

        int posNum1 = 0;
        int posNum2 = 0;

        int numForChangePos = 0;

        for (int i = 0; i < inNumPos1.length; i++) {

            if ((inNumPos1[i] != 0) || (inNumPos2[i] != 0)){

                posNum1 = inNumPos1[i];
                posNum2 = inNumPos2[i];

                //if (posNum1 < (posNum2) && posNum1 != (posNum2 - 1)) {

                numForChangePos = inMas[posNum1 + 1];

                inMas[posNum1 + 1] = inMas[posNum2];
                inMas[posNum2] = numForChangePos;
                //}
            }
            else {
                return inMas;
            }
        }

        return inMas;
    }

}
