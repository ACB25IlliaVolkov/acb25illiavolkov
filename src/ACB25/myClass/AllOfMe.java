package ACB25.myClass;

public class AllOfMe {

    public static void main(String[] args) {

    }

    public static int randomNumberRange(int numberMin, int numberMax) {

        return (int) Math.round(Math.random() * (numberMax - numberMin) + numberMin);

    }

    public static int[] createMassWithRandomNumber(int massLength, int numberMin, int numberMax) {

        int[] mass = new int[massLength];

        for (int i = 0; massLength > i; i++) {

            mass[i] = randomNumberRange(numberMin, numberMax);

        }

        return mass;
    }

    public static void printMass(int[] mass) {
        for (int i = 0; mass.length > i; i++) {

            System.out.print(mass[i] + ", ");
        }
        System.out.println();
    }
}
