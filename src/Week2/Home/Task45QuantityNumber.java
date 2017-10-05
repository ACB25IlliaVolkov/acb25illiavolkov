package Week2.Home;

import myClass.AllOfMe;

import javax.swing.*;

public class Task45QuantityNumber {

    public static void main(String[] args) {

        int[] arNums = AllOfMe.createMassWithRandomNumber(25, 2, 15);

        String inputNumber = JOptionPane.showInputDialog("Какое число будем искать?");

        int number = Integer.parseInt(inputNumber);
        int quantityNumber = 0;


        for (int i:arNums){

            if (i==number){
                quantityNumber += 1;
            }

        }

        AllOfMe.printMass(arNums);

        System.out.println("Введенное число " + number + " встречаетя " + quantityNumber + " раз(а)!");

    }
}
