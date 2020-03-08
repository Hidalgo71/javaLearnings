package javaLearningPack;

public class forAndSwitch
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)
        {
            switch (i)
            {
                case 0:
                    System.out.println("Try 1.");
                    break;
                case 1:
                    System.out.println("Try 2.");
                    break;
                case 2:
                    System.out.println("Try 3.");
                    break;
                default:
                    System.out.println("End ot try limit.");
            }
        }
        System.out.println("===================");

        for (int j = 0; j < 9; j++)
        {
            switch (j)
            {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("< 5:" + j);
                    break;
                case 5:
                case 6:
                    System.out.println("< 7:" + j);
                    break;
                case 7:
                    System.out.println("Number 7" + j);
                    break;
                default:
                    System.out.println("> 7:" + j);
            }
        }
    }
}
