package javaLearningPack;

public class stringArrays
{
    public static void main(String[] args)
    {
        String[][] arrQue =
                {
                        {"asd", "dsa", "sad"},
                        {"asd", "dsa", "sad"},
                        {"asd", "dsa", "sad"}
                };
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3;j++)
            {
                System.out.print(" " + arrQue[i][j]);
            }
            System.out.println(" ");
        }
    }
}
