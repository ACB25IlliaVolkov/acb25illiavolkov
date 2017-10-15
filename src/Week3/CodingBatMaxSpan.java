package Week3;

public class CodingBatMaxSpan {

    public static void main(String[] args) {

        int numMas[] = {1,4,2,1,4,4,4};

        int numMaxSpan = maxSpan(numMas);

        System.out.println(numMaxSpan);

    }

    public static int maxSpan(int[] nums) {
        int[] massMaxSpan = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            massMaxSpan[i] = findMaxSpanNumber(nums, num);
            //return findMaxSpanNumber(nums, num);
        }
        int maxSpan = massMaxSpan.length > 0 ? massMaxSpan[0] : 0;
        for (int i = 0; i < massMaxSpan.length; i++) {
            if (maxSpan < massMaxSpan[i]) {
                maxSpan = massMaxSpan[i];
            }
        }
        return maxSpan;
    }

    public static int findMaxSpanNumber(int[] nums, int number) {

        int firstPos = 0;
        int lastPos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == number) {

                firstPos = i;

                break;

            }
        }

        for (int i = nums.length - 1; i > 0; i = i - 1) {

            if (nums[i] == number) {

                lastPos = i ;

                break;
            }
        }

        return lastPos - firstPos + 1;

    }


}
