package ACB25.Week2;

public class QuantityPairedNumber {
    public static void main(String[] args) {

        double randomNumber = Math.random()*10;

        int massLength = (int)randomNumber;

        System.out.println("Mass Length = "+massLength);

        int[] massNumber = new int[massLength];

        int quantityPairedNumber = 0;

        for (int i = 0; massNumber.length > i; i++){
            massNumber[i] = (int)(Math.random()*10);

            System.out.print(massNumber[i] + ", ");

            quantityPairedNumber = quantityPairedNumber + isPairedNumber(massNumber[i]);
        }

        System.out.println("\n"+ "Quantity Paired Number = " + quantityPairedNumber + ";   " + "Not Paired = " + (massLength - quantityPairedNumber));

    }

    public static int isPairedNumber(int number){
        return (number%2==0 ? 1:0);
    }
}
