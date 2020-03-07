package javaLearningPack;

public class continueFunc
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 8;i++)
        {
            System.out.println(i + " ");
            if (i % 3 == 0)
                continue;
            System.out.println("");
        }

        System.out.println("===================");

        for (int var1 = 0; var1 < 5; var1++)
        {
            for (int var2 = 0; var2 < 5; var2++)
            {
                if (var2 == 2)
                    continue;       //Not Allowed to var2 = 2, Turning back to upper braced
                System.out.println("Var1: " + var1 + ", Var2: " + var2 );
            }
        }

        System.out.println("===================");
        //Continue Label

        tag1: for (int var1 = 0; var1 < 5; var1++)
        {
            for (int var2 = 0; var2 < 5; var2++)
            {
                if (var2 == 2)
                    continue tag1;       //Not Allowed to var2 = 2, Turning back to where tag placed
                System.out.println("Var1: " + var1 + ", Var2: " + var2 );
            }
        }
    }
}
