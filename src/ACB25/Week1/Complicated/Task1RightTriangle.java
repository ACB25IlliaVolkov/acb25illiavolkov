package ACB25.Week1.Complicated;

import javax.swing.*;
import java.util.Arrays;
// import java.util.Scanner.

public class Task1RightTriangle {
    public static void main(String[] args) {

        System.out.println("Будем определять <<ПРЯМОУГОЛЬНОСТЬ>> треугольника");

        //        Scanner sc = new Scanner(System.in);

        int[] massSide = new int[3];

        for (int i = 0; i < massSide.length; i++) {

            String inputNumber = JOptionPane.showInputDialog("Введите длину стороны " + (i+1));

            massSide[i] = Integer.parseInt(inputNumber);
        }
        Arrays.sort(massSide);

        System.out.println("Катет 1 = "+massSide[0]+"\n"+"Катет 2 = "+massSide[1]+"\n"+"Гипотенуза = "+massSide[2]+"\n");

        System.out.println("Треугольник - "+((Math.pow(massSide[2],2)==(Math.pow(massSide[0],2)+Math.pow(massSide[1],2)))?"Прямойгольный":"Не Прямойгольный"));
    }
}