package ACB25.Week1;

import javax.swing.*;
// import java.util.Scanner.

public class Task3IntegerNumber {
    public static void main(String[] args) {

        String inputNumber = JOptionPane.showInputDialog("Enter number");
        int number = Integer.parseInt(inputNumber);

//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();

        if (number % 7 == 0) {

            System.out.println(number*2);
        }
        else {
            System.out.println("Число НЕ делится на 7 нацело");
        }
    }
}
