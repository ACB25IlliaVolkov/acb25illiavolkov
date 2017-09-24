package myClass;

public class AllOfMe {

    public static void main(String[] args) {

    }

    public static int[] createMassWithRandomNumber(int massLength, int numberMin, int numberMax) {

        int[] mass = new int[massLength];

        for (int i = 0; massLength > i; i++) {

            mass[i] = Math.round(numberMin + Math.round(Math.random()) * ((numberMax - numberMin) + 1));

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
