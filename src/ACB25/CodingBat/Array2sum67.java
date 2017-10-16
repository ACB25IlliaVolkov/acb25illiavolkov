package ACB25.CodingBat;

import ACB25.myClass.AllOfMe;

public class Array2sum67 {
    public static void main(String[] args) {


        int[] nums = AllOfMe.createMassWithRandomNumber(5, -15, 9);

        int sum = 0;

        boolean runSum = true;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) {
                runSum = false;
            }

            if (nums[i] == 7) {
                if (!runSum) {
                    runSum = true;
                    continue;
                }
            }

            if (runSum) {
                sum = sum + nums[i];
            }

        }
        AllOfMe.printMass(nums);

        System.out.println(sum);

    }
}

