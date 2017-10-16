package ACB25.Week1;

import javax.swing.*;

public class Task2GreaterNumber {

    public static void main(String[] args) {

        int[] massNumber = new int[3];

        for (int i = 0; massNumber.length > i; i++){

            String inputNumber = JOptionPane.showInputDialog("Enter Number");

            massNumber[i] = Integer.parseInt(inputNumber);
        }

        int minNumber = massNumber[0];
        int maxNumber = 0;

        for (int i = 0; massNumber.length > i; i++){

            if (massNumber[i] >= maxNumber) {

                maxNumber = massNumber[i];
            }

            if (massNumber[i] <= minNumber) {

                minNumber = massNumber[i];
            }
        }

        System.out.println("Min number = " + minNumber);

        System.out.println("Max number = " + maxNumber);

    }


}
