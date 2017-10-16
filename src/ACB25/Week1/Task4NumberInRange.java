package ACB25.Week1;

//import javax.swing.*;
import java.util.Scanner;

public class Task4NumberInRange {
    public static void main(String[] args) {

        //String inputNumber = JOptionPane.showInputDialog("Введите число с плавающей точкой");
        //int number = Integer.parseInt(inputNumber);

        System.out.println("Введите число с плавающей точкой");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();

        if (number > 0 && number < 1) {

            System.out.println("Число в диапазоне от 0 до 1");
        }
    else {
            System.out.println("Число НЕ в диапазоне от 0 до 1");
        }
    }
}
