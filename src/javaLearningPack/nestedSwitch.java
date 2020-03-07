package javaLearningPack;

public class nestedSwitch
{
    public static void main(String[] args)
    {
        int i = 0, j = 20;

        switch (i)
        {
            case 0:
                switch (j)
                {
                    case 0:
                        System.out.println("i=0, j=0");
                        break;
                    case 1:
                        System.out.println("i=0, j=1");
                        break;
                    default:
                        System.out.println("Inner Switch Default Message.");
                }
                break;

            default:
                System.out.println("Outer Switch Default Message.");
        }
    }
}
