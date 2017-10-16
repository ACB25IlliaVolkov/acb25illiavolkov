package ACB25.Week2.Home;

import javax.swing.*;

public class Task8GuessNumber {

    public static void main(String[] args) {

        System.out.println("Угадайте число от 25 до 125( у Вас 5 попыток)");

        int randNum =  (int)Math.round(Math.random() * (125 - 25) + 25);

        for (int i=0; i<5; i++) {

            String inpNum = JOptionPane.showInputDialog("Введите, осталось " + (5-i) + " попыток)");
            int num = Integer.parseInt(inpNum);

            if (num<randNum) {

                System.out.println("Ваше число меньше загаданного");
            }
            else if (num>randNum) {

                System.out.println("Ваше число больше загаданного");
            }
            else {
                System.out.println("Ура угадалииииииии!!!");
                break;
            }
        }

    }


}
