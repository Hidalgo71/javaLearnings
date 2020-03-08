package javaLearningPack;

public class breakFunc
{
    public static void main(String[] args)
    {
        int a = 0;

        while (a < 20)
        {
            if (a == 7)
                break;
            System.out.println("a: " + a);
            a++;
        }

        System.out.println("===================");
        int[] array1 = new int[] {1,2,3,4,5};
        for (int i = 0; i < array1.length; i++)
        {
            if (array1[i] == 4)
                break;
            else
                System.out.println(array1[i]);
        }

        System.out.println("===================");
        //Break Label

        boolean check = true;
        tag1:
        {
            tag2:
            {
                tag3:
                {
                    System.out.println("Before Break");
                    if (check)
                        break tag2;
                    System.out.println("After Break");
                }
                System.out.println("After tag3");
            }
            System.out.println("After tag2");
        }

        System.out.println("===================");
        //Return
        boolean chech3 = false;

        for (int i = 0; i < 22; i++)
        {
            System.out.println("Before Return.");
            if (true)
                return;
            System.out.println("After Return.");
        }
    }
}
