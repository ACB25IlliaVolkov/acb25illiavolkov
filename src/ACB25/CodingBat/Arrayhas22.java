package ACB25.CodingBat;

import ACB25.myClass.AllOfMe;

public class Arrayhas22 {

    public static void main(String[] args) {


        int[] nums = AllOfMe.createMassWithRandomNumber(10, 6, 25);

        int numsLength = nums.length;

        boolean rez = false;

        for (int i = 0; i < numsLength; i++) {

            if (nums[i] == 2 && ((i == (numsLength - 1)) ? false : nums[i + 1] == 2)) {
                rez = true;
            }

        }

        AllOfMe.printMass(nums);

        System.out.println(rez);

    }
}

