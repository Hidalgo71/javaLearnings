package javaLearningPack;

public class forLoop
{
    public static void main(String[] args)
    {
        int limit = 50;
        int limitP = 80;

        for (int i = 0; i < 7; i++)
            System.out.println("i number is: " + i);

        System.out.println("===================");

        for (int i2 = 0; i2 < 7; i2++)
        {
            System.out.println("i number is: " + i2);
            i2++;
        }

        System.out.println("===================");
        //Even and Odd Numbers
        System.out.println("Odd Numbers: ");
        for (int i = 1; i <= limit; i++)
        {
            if (i % 2 != 0)
            {

                System.out.print(i +" ");
            }
        }

        System.out.println("\nEven Numbers: ");
        for (int j = 1; j <= limit; j++)
        {
            if (j % 2 == 0)
            {
                System.out.print(j +" ");
            }
        }

        System.out.println("\n===================");
        //Prime Numbers
        for (int i = 2; i < limitP; i++)
        {
            boolean check = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.print(i + " ");
        }
    }
}
