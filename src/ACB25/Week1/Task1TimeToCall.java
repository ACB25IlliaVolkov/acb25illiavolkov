package ACB25.Week1;

//import javax.swing.*;
import java.util.Scanner;

public class Task1TimeToCall {
    public static void main(String[] args) {

//            String inputTime = JOptionPane.showInputDialog("Enter time");
//            int time = Integer.parseInt(inputTime);

        System.out.println("Введите время от 0 до 24");

        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if (time > 24 || time < 0) {

            System.out.println("Вы ввели время в некорректном формате! Необходимо всевти от 0 до 24");
        }
        else {
            if (time >= 8 && time <= 21) {

                System.out.println("Привет");
            }
            else {
                System.out.println("Абонент отдыхает!");
            }
        }
    }

}
