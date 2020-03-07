package javaLearningPack;

public class findWordInString
{
    public static void main(String[] args)
    {
        String centence = "Los Angeles Lakers Hero Kobe Bryand and His Lovely" +
                " Doughter Gigi Died at Helicopter Crush. So Sad...";

        String find = "Kobe";
        boolean check = false;

        int lenght = centence.length() - find.length();
        test:  for (int i = 0; i <= lenght; i++)
        {
            int n = find.length();
            int j = i;              //Looking for a char we are looking for
            int k = 0;

            while (n-- != 0)
            {
                if (centence.charAt(j++) != find.charAt(k++))
                {
                    continue test;
                }
            }
            check = true;
            break test;
        }
        System.out.println(check ? "Found" : "Not Founded");
    }
}
