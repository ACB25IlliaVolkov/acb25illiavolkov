package Week1;

import javax.swing.*;
// import java.util.Scanner.

public class WhereAreYou {
    public static void main(String[] args) {

        String inputTime = JOptionPane.showInputDialog("Enter time");
        int time = Integer.parseInt(inputTime);

//        Scanner sc = new Scanner(System.in);
//        int time = sc.nextInt();

        if (time >= 9 && time <= 18) {

            System.out.println("I'm at work");
        }
        else {
            System.out.println("I'm resting");
        }
    }

}
