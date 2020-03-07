package javaLearningPack;

public class whileLoop
{
    public static void main(String[] args)
    {
        int num1 = 1;

        while (num1 < 7)
        {
            System.out.println("Result: " + num1);
            num1++;
        }

        System.out.println("===================");
        //NESTED WHILE LOOP
        int i = 7;
        int j = 19;
        while (++i < --j);
                            //!!!IF YOU WANT TO SEE ONLY LOOP RESULT USE ;
                            //FOR ALL RESULT DON'T USE ;
            System.out.println("Num i: " + i + "\nNum j: " + j);

        System.out.println("===================");
        //Do While
        int num2 = 18;
        do
            {
                System.out.println("Result: " + num2);
                num2++;
            }
        while (num2 < 8);
    }
}
