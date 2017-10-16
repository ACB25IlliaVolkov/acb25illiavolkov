package ACB25.Week1.Complicated;

import ACB25.myClass.AllOfMe;
// import java.util.Scanner.

public class Task2PowNumber {
    public static void main(String[] args) {

        System.out.println("Автоматически создаем  массив и наполняем значениями со знаком + или - ");

        //        Scanner sc = new Scanner(System.in);

        int[] mas= AllOfMe.createMassWithRandomNumber(3, -10, 10);

        System.out.println("Исходный массив");

        AllOfMe.printMass(mas);

        for (int i=0; i<mas.length; i++){

            int elVal = mas[i];

            mas[i] = (elVal<0)?0:((int)Math.pow(elVal, 3));
        }

        System.out.println("Конечный массив");

        AllOfMe.printMass(mas);
    }
}