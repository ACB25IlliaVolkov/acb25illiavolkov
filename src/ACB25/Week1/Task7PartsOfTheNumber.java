package ACB25.Week1;

//import javax.swing.*;
import java.util.Scanner;

public class Task7PartsOfTheNumber {
    public static void main(String[] args) {

        //String inputNumber = JOptionPane.showInputDialog("Введите число с плавающей точкой");
        //int number = Integer.parseInt(inputNumber);

        System.out.println("Введите 2 числа");

        Scanner sc = new Scanner(System.in);

        System.out.println("Первое число");
        float number1 = sc.nextFloat();

        System.out.println("Второе число");
        float number2 = sc.nextFloat();
       double res = (number1 / number2);

        if (number1 % number2 == 0) {

            System.out.println("ДА!!! Результат составил " + (res));
        }
    else {
            int res2 = (int)res;
            System.out.println("НЕТ!!! Результат составил " + (res2) + " и " + (res - res2));
        }
    }
}
