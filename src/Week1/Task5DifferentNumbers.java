package Week1;

import javax.swing.*;
//import java.util.Scanner;

public class Task5DifferentNumbers {
    public static void main(String[] args) {

        String inputNumber1 = JOptionPane.showInputDialog("Введите первое чило");
        int number1 = Integer.parseInt(inputNumber1);

        String inputNumber2 = JOptionPane.showInputDialog("Введите второе число");
        int number2 = Integer.parseInt(inputNumber2);

        //System.out.println("Введите число с плавающей точкой");
        //Scanner sc = new Scanner(System.in);

        if (number1 > number2) {

            System.out.println("Разница составила " + (number1 - number2));
        }
        else if (number1 < number2){
            System.out.println("Сумма составила " + (number1 + number2));
        }
    }
}