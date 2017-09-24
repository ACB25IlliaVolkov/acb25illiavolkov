package Week1;

import javax.swing.*;
//import java.util.Scanner;

public class Task8LastSymbol {
    public static void main(String[] args) {

        String inputNumber1 = JOptionPane.showInputDialog("Введите первое чило");
        int number1 = Integer.parseInt(inputNumber1);

        String inputNumber2 = JOptionPane.showInputDialog("Введите второе число");
        int number2 = Integer.parseInt(inputNumber2);

        //System.out.println("Введите число с плавающей точкой");
        //Scanner sc = new Scanner(System.in);

        String lastSymbolNumber1 = "" + number1;
        int lastSymbol1 = lastSymbolNumber1.charAt((lastSymbolNumber1.length()-1));

        String lastSymbolNumber2 = "" + number2;
        int lastSymbol2 = lastSymbolNumber2.charAt((lastSymbolNumber2.length()-1));

        System.out.println((lastSymbol1 % lastSymbol2 == 0));

    }
}