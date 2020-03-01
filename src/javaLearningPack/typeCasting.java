package javaLearningPack;

public class typeCasting
{
    public static void main(String[] args)
    {
        byte numB;
        int numI = 1212;
        float numF = 7.1f;
        double numD = 248.2;

        numB = (byte) numI;
        System.out.println("Int type printing Byte Type: " + numB);
        numB = (byte) numF;
        System.out.println("Int type printing Byte Type: " + numB);
        numB = (byte) numD;
        System.out.println("Int type printing Byte Type: " + numB);

        numD = numI;
        System.out.println("Double type printing Int Type: " + numD);

        numF = (float) numD;
        System.out.println("Float type printing Double Type: " + numF);
    }
}