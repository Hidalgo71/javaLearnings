package javaLearningPack;

public class controlStatement
{
    public static void main(String[] args)
    {
        //If
        boolean casE = true;

        if (casE)
        {
            System.out.println("Case is " + casE);
        }

        int num1 = 99;
        char letter = '-';

        if (num1 > 90)
        {
            letter = 'A';
            System.out.println("Result is " + letter);
        }

        System.out.println("===================");

        //Nested If
        double num2 = 4.2;

        if (num2 != 0)
        {
            if (num2 > 0)
            {
                System.out.println("Result: " + num2*2);
            }
            else
                System.out.println("Your Number is Negative!");
        }

        System.out.println("===================");
        //Else If

        int num3 = 15, num4 = 52;

        if (num3 > num4)
        {
            System.out.println("Num3 is Bigger Than Num4");
        }
        else if (num3 < num4)
        {
            System.out.println("Num4 is Bigger Than Num3");
        }
        else
        {
            System.out.println("Num3 and Num4 are Equal");
        }

        System.out.println("===================");
        //And Or

        int year = 2025;

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
        {
            System.out.println(year + " is a Leap Year");
        }
        else
        {
            System.out.println(year + " is not a Leap Year");
        }
















    }
}
