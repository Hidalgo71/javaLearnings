package javaLearningPack;

public class forEach
{
    public static void main(String[] args)
    {
        int result = 0;
        int[] nums = {71, 99, 24, 8, 51};
        for (int value : nums)
        {
            System.out.println("Array's Elements: " + value);
        }

        System.out.println("===================");

        int[] nums2 = {71, 99, 24, 8, 51};
        int sum = 0;

        for (int j : nums2)
        {
            System.out.println("Array's Elements: " + j);
            sum += j;
        }
        System.out.println("Array's Elements Sum: " + sum);

        System.out.println("===================");
        //2 Dimensional For Each

        int[][] twiDimArray = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                twiDimArray[i][j] = (i + 2) * (j + 3);

        for (int[] oneDimArray : twiDimArray)
        {
            for (int oda : oneDimArray) {
                System.out.println("Value: " + oda);
                result += oda;
            }
        }
        System.out.println("Sum: " + result);
    }
}
