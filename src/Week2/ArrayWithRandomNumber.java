package Week2;

public class ArrayWithRandomNumber {
    public static void main(String[] args) {

        double randomNumber = Math.random() * 10;

        int massLength = (int) randomNumber;

        System.out.println("Mass Length = " + massLength);

        //int[] massNumber = new int[massLength];

        int[] massNumber = createMass(massLength);

        printMass(massNumber);
    }

    public static void printMass(int[] mass) {
        for (int i = 0; mass.length > i; i++) {

            System.out.print(mass[i] + ", ");
        }


    }

    public static int[] createMass(int massLength) {

        int[] mass = new int[massLength];

        for (int i = 0; massLength > i; i++) {
            mass[i] = (int) (Math.random() * 10);
        }

        return mass;
    }
}