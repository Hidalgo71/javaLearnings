package javaLearningPack;

public class findCharInStrings
{
    public static void main(String[] args)
    {
        String centence = "Los Angeles Lakers Hero Kobe Bryand and His Lovely" +
                " Doughter Gigi Died at Helicopter Crush. So Sad...";
        int count = 0;
        for (int i = 0; i < centence.length(); i++)
        {
            if (centence.charAt(i) != 'o')
                continue;
            count++;
        }
        System.out.println(count + " o.");
    }
}
