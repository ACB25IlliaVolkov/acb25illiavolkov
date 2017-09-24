package Week1;

//import javax.swing.*;
import java.util.Scanner;

public class Task6NumberInRange {
    public static void main(String[] args) {

        //String inputNumber = JOptionPane.showInputDialog("Введите число с плавающей точкой");
        //int number = Integer.parseInt(inputNumber);

        System.out.println("Введите 2 числа");

        Scanner sc = new Scanner(System.in);

        System.out.println("Первое число");
        float number1 = sc.nextFloat();

        System.out.println("Второе число");
        float number2 = sc.nextFloat();

        double symNumber = number1 + number2;

        if (symNumber >= 11 && symNumber <= 19) {

            System.out.println("Сумма в диапазоне от 11 до 19");
        }
    else {
            System.out.println("Сумма НЕ в диапазоне от 11 до 19");
        }
    }
}
